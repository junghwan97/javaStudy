package ch05.exercise;

import java.util.Arrays;

public class Ex22 { // 188p
    public static void main(String[] args) {

        // System.arraycopy 방식
        String[] oldArray = {"java", "array", "copy"};
        String[] newArray = new String[5];
        System.arraycopy(oldArray, 0, newArray,0,oldArray.length);
        System.out.println(Arrays.toString(newArray));

        System.out.println();

        // Array.copyOf 방식
        String[] arr1 = {"Hello", "World", "Welcome"};
        String[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr2));
    }
}
