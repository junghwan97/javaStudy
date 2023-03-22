package ch18.lecture.p03inputstream;

import java.io.FileInputStream;

public class C03InputStream {
    public static void main(String[] args) {
        String name = "C:/Temp/test3.db";
        try(var is = new FileInputStream(name)){

            byte[] array = new byte[5];

            int len1 = is.read(array);
            int len2 = is.read(array);
            int len3 = is.read(array);
            int len4 = is.read(array);
            int len5 = is.read(array);
            int len6 = is.read(array);
            int len7 = is.read(array);

            System.out.println(len1);
            System.out.println(len2);
            System.out.println(len3);
            System.out.println(len4);
            System.out.println(len5);
            System.out.println(len6);
            System.out.println(len7);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
