package ch11.lecture.p02try_catch;

public class C07MultipleException {
    public static void main(String[] args) {
        try {
            int[] a = {0, 1};
            int c = 3 / a[0];

            // ArithmeticException
            // ArrayIndexOutOfBoundsException
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("continue...");
    }
}
