package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C09Sort {
    public static void main(String[] args) {
        //sort : 정렬
        int[] arr1 = {9,0,2,3,8,-1};
        System.out.println(Arrays.toString(arr1));

        // 오름차순 정렬
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"java", "hello", "html", "css", "Java", "Css"};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[0]);
    }
}
