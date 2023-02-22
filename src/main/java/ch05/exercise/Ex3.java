package ch05.exercise;

public class Ex3 {
    public static void main(String[] args) {
        String[] seasons = {"spring", "summer", "fall", "winter"};
        for (int i = 0; i < 4; i++){
            System.out.println("seasons[" + i + "]: " + seasons[i]);
        }
        seasons[1] = "여름";
        System.out.println("seasons[1]: " + seasons[1]);

        System.out.println();

        int sum = 0;
        double avg = 0;
        int[] scores = {95, 85, 80};
        for (int i = 0; i < 3; i++){
            sum += scores[i];
        }
            avg = (double)sum / 3;
        System.out.println("점수들의 총합은 " + sum + "입니다.");
        System.out.println("점수들의 평균은 " + avg + "입니다.");
    }
}
