package ch18.exercise.q7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/ch18/exercise/q7/Example.java";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowNumber++;
            if ((rowData = br.readLine()) != null) {
                System.out.println(rowNumber + ": " + rowData);
            }else break;
        }

    }
}
