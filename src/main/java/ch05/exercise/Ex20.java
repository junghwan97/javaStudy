package ch05.exercise;

public class Ex20 { //190p
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};
        int sum = 0;
        for (int score : scores){
            sum += score;
        }
        System.out.println("배열의 총합은 " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("배열의 평균은 " + avg);

    }
}
