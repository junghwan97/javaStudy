package ch11.lecture.p04throw;

public class C11Throw {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("false");
        }
    }

    public static void method1() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
        System.out.println("true");
    }
}
