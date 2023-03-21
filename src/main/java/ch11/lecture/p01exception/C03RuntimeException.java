package ch11.lecture.p01exception;

public class C03RuntimeException {
    public static void main(String[] args) {

        // NullPointerException 발생
        String a = null;
        System.out.println(a.length());
    }
}
