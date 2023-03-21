package ch11.lecture.p01exception;

public class C06CheckedException {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.Object");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("continue...");
    }
}
