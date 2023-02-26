package ch05.Check;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q7Sort {
    public static void main(String[] args) {

        int[] array = {1, 7, 5, 8, 7, 9};
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }
}
