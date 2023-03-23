package ch18.exercise.q10;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("원본 파일 경로 : ");
        String origin = sc.nextLine();
        System.out.print("복사 파일 경로 : ");
        String copy = sc.nextLine();

        File originalFile = new File(origin);
        File copyFile = new File(copy);
        if (!originalFile.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
        }
        if (!copyFile.exists()) {
            copyFile.mkdirs();
        }

        // 복사하는 코드
        InputStream is = new FileInputStream(origin);
        OutputStream os = new FileOutputStream(copy);

        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        byte[] data = new byte[1024];
        int num = 0;
        while (true) {
            num = bis.read(data);
            if (num == -1) break;
            bos.write(data, 0, num);
        }
        bos.flush();
        bos.close();
        bis.close();
        System.out.println("복사가 성공되었습니다.");
    }
}
