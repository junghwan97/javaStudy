package ch18.lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C03Close {
    public static void main(String[] args) {
        // try-with-resources

        // os.close(); 없이 자동으로 닫아줌
        try (OutputStream os = new FileOutputStream("");){

            os.write(1);
            os.flush();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
