package ch18.lecture.p08byte_to_char;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C01OutputStreamWriter {
    public static void main(String[] args) throws Exception {

        String fileName = "output/byte1.txt";
        OutputStream os = getOutput(fileName);
        OutputStreamWriter opw = new OutputStreamWriter(os);

        opw.write('a');
        opw.write('b');
        opw.write('한');

        opw.close();
    }

    public static OutputStream getOutput(String fileName) throws Exception {
        OutputStream os = new FileOutputStream(fileName);

        return os;
    }
}

