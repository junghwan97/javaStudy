package ch05.lecture.p03matrix;

public class C03Matrix {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[][] arr2 = {
                new int[]{1, 2, 3, 4},
                {6, 7, 8, 9},
                {10, 11, 12, 13}
        };

        int[][] arr3 = {
                {1,2,3,4},
                {10,20},
                {99, 100, 101}
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }
    }
}
