package ch18.lecture.p06buffered;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C02BufferedOutputSream { // C01BufferedOutputStream과 차이가 많이 남
    public static void main(String[] args) {

        String name = "output/buffered1.txt";
        try (
                OutputStream fis = new FileOutputStream(name);){

            long start = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                fis.write(1);
            }
            fis.flush();
            long end = System.nanoTime();
            System.out.println((end - start) + "ns");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
