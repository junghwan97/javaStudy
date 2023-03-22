package ch18.lecture.p03inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C01InputStream {
    public static void main(String[] args) {
        // InputStream
        // byte 단위 입력 스트림
        // 주묘 메서드 : read()

        String name = "C:/Temp/test2.db";
        try (InputStream is = new FileInputStream(name)) {
            // read : 한 바이트 읽기 / 범위 이상의 데이터를 읽을 시 -1 반환
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            // 아래부터 -1 반환
            System.out.println(is.read());
            System.out.println(is.read());

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
