package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C08DeepToString {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 1, 0};
        System.out.println(Arrays.toString(arr1));

        int[][] arr2 = {
                {7, 8},
                {2, 3}
        };

        System.out.println(arr2[0]);
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        System.out.println("for loop로 toString");
        for (int[] arr : arr2){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
        System.out.println("deepTString ");
        System.out.println(Arrays.deepToString(arr2));

        arr2[0][0] = 99;
        System.out.println(Arrays.toString(arr2));

    }
}
