package ch05.exercise;

public class Ex10 { // 148p
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3};
        int[] arr2 = new int[] {1,2,3};
        int[] arr3 = arr2;

        System.out.println(arr1 == arr2); // false
        System.out.println(arr2 == arr3); // true

        arr2[0] = 5;
        System.out.println(arr3[0]);
    }
}
