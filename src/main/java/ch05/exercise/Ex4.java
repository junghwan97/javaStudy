package ch05.exercise;

public class Ex4 {
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0;
        int[] arr1 = {90, 70, 85};
        for (int i = 0; i < arr1.length; i++){
            sum += arr1[i];
            System.out.println("arr1[" + i + "]: " + arr1[i]);
        }
        System.out.println("점수들의 총합은 " + sum + "입니다.");

        avg = (double) sum / arr1.length;
        System.out.println("점수들의 평균은 " + avg + "입니다.");
    }
}
