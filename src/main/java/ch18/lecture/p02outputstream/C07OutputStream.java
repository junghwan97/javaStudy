package ch18.lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class C07OutputStream {
    public static void main(String[] args) {
        try (var os = new FileOutputStream("C:/Temp/test3.db")) {

            // 한 바이트 쓰기
            os.write(30);
            os.write(134235);

            // 여러 바이트 쓰기
            byte[] data = {3, 3, 3, 3, 3, 3, 3, 3, 3};
            os.write(data);

            // 여러 바이트 쓰기(베열의 일부분)
            os.write(data, 0, 3); // 3 byte
            os.write(data, 4, 5); // 5 byte
            os.write(data, 0, data.length); // 9 byte


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
