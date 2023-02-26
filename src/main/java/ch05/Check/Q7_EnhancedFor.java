package ch05.Check;

public class Q7_EnhancedFor {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int max = Integer.MIN_VALUE;

        for (int a : array){
            if (a > max){
                max = a;
            }
        }
        System.out.println(max);



    }
}
