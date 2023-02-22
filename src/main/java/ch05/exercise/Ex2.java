package ch05.exercise;

public class Ex2 { //170
    public static void main(String[] args) {
        int[] score1 = new int[] {83, 90, 87};
        int sum1 = 0;
        for (int i = 0; i < 3; i++){
            sum1 += score1[i];
        }
        System.out.println("총합은 " + sum1);
        System.out.println();

    printItem(new int[]{83, 90, 87});
    }
    private static void printItem(int[] scores) {
        for (int i = 0; i < 3; i++){
            System.out.println("scores[" + i + "]: " + scores[i]);
        }

    }
}
