package ch06.sec10.exam01;

import java.util.Arrays;

public class CalculatorExample {
    public static void main(String[] args) {
        double res1 = 10 * 10 * Calculator.pi;
        int res2 = Calculator.plus(5, 6);
        int res3 = Calculator.minus(10,5);

        System.out.println("res1: " + res1);
        System.out.println("res2: " + res2);
        System.out.println("res3: " + res3);

        // Arrays.toString
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
    }
}
