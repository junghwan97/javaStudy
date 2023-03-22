package ch18.lecture.p03inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class C02InputStream {
    public static void main(String[] args) {
        try(var is = new FileInputStream("C:/Temp/test3.db")){

            int data = 0;
            while ((data = is.read())!= -1){
                System.out.println(data);
            }
            System.out.println(data);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
