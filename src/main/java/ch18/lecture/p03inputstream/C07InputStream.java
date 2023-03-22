package ch18.lecture.p03inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C07InputStream {
    public static void main(String[] args) {
        String src = "output/test.jpg";
        String des = "output/test_copy2.jpg";

        try (var is = new FileInputStream(src);
             var os = new FileOutputStream(des);) {
            is.transferTo(os);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
