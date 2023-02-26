package ch05.lecture.p06for;

public class C01EnhancedFor {
    public static void main(String[] args) {
        int[] arr = {5, 6, 10, 9, 1, 2};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        //enhanced for(향상된 for문), foreach
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
