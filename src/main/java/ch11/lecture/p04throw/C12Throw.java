package ch11.lecture.p04throw;

import java.io.FileInputStream;

public class C12Throw {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static void method1() throws Exception {
        new FileInputStream("");
    }
}
