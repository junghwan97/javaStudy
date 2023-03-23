package ch18.lecture.p09filter;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class C02Filter {
    public static void main(String[] args) {

        String fileName = "output/byte1.txt";

        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                OutputStreamWriter osw = new OutputStreamWriter(bos);) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
