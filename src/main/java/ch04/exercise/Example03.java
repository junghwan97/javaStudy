package ch04.exercise;

public class Example03 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        while (i <= 100) {
            sum += i;

            i += 3;
        }

        System.out.println(sum);
    }
}
