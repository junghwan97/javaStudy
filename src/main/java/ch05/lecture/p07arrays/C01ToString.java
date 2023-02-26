package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C01ToString {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 12};
        for (int n : arr) {
            System.out.println(n);
        }

        System.out.println(Arrays.toString(arr));
        String[] arr2 = {"java", "hello", "friday", "sunday"};
        System.out.println(Arrays.toString(arr2));
    }
}
