package ch05.lecture.p01array;

public class C05Array {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[3];

        int[] arr2 = new int[4];

        int[] arr3;
        arr3 = new int[]{3, 4, 5};

        int[] arr4 = new int[]{3, 4, 5};

        // 타입선언시 초기값 할당 할 때 (new 타입명) 생략 가능

        int[] arr5 = {1, 2, 3,}; // 가능
//        int[] arr6;
//        arr6 = {1, 2, 3,};  // 불가능
    }
}
