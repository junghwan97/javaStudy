package ch18.lecture.p08byte_to_char;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C02InputStreamReader {
    public static void main(String[] args) throws Exception {
        String name = "output/byte1.txt";
        InputStream is = new FileInputStream(name);
        InputStreamReader isr = new InputStreamReader(is);


        int f1 = isr.read();
        System.out.println((char) f1);

        int f2 = isr.read();
        System.out.println((char) f2);

        int f3 = isr.read();
        System.out.println((char) f3);

    }
}
