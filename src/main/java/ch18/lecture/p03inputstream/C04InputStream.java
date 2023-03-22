package ch18.lecture.p03inputstream;

import java.io.FileInputStream;
import java.util.Arrays;

public class C04InputStream {
    public static void main(String[] args) {
        String name = "C:/Temp/test3.db";
        try (var is = new FileInputStream(name)) {
            byte[] arr = new byte[5];

            int len = 0;
            while ((len = is.read(arr)) != -1) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(is.read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
