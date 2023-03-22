package ch18.lecture.p03inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C05InputStream {
    public static void main(String[] args) {
        String src = "output/test.jpg";
        String des = "output/test_copy.jpg";

        try (
                var is = new FileInputStream(src);
                var os = new FileOutputStream(des);) {
            int data = 0;
            while ((data = is.read()) != -1) {
                os.write(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("복사완료");
    }
}
