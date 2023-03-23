package ch18.lecture.p09filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class C01Filter {
    public static void main(String[] args) {
        // stream 연결 가능
        String fileName = "output/byte1.txt";
        try (
                FileInputStream fis = new FileInputStream(fileName);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);) {

            String s = null;
            while ((s = br.readLine()) != null){
                System.out.println(s);

            }
            br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
