package ch11.lecture.p04throw;

import java.io.FileNotFoundException;

public class C09Throw {
    public static void main(String[] args) {
//        try {
//            method1();
//        } catch (ClassNotFoundException | FileNotFoundException e) {
//            e.printStackTrace();
//        }         // Exception으로 받기 때문에 (다형성을 이유로) 오류 발생

        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        boolean a = true;
        if (a) {
            throw new ClassNotFoundException();
        } else {
            throw new FileNotFoundException();
        }
    }
}
