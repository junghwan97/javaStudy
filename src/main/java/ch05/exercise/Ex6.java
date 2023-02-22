package ch05.exercise;

public class Ex6 { // 178p
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };
        System.out.println("1차원 배열의 길이(반의 수) " + scores.length);
        System.out.println("2차원 배열의 길이(1반의 학생 수) " + scores[0].length);
        System.out.println("2차원 배열의 길이(2반의 학생 수) " + scores[1].length);
        System.out.println();
        // 1반의 세 번째 학생 점수 확인하기
        System.out.println("1반의 3번 학생 점수(scores[0][2]): " + scores[0][2]);
        //2반의 두 번째 학생 점수 확인하기
        System.out.println("2반의 2번 학생 점수(scores[1][1]): " + scores[1][1]);

        System.out.println();

        //1반의 평균 구하기
        int sum1 = 0;
        int total1 = scores[0].length;
        for (int i = 0; i < scores[0].length; i++) {
            sum1 += scores[0][i];
        }
        double avg = (double)sum1 / total1;
        System.out.println("1반의 평균 점수는 " + avg);
        System.out.println();

        //2반의 평균 구하기
        int sum2 = 0;
        int total2 = scores[1].length;
        for (int i = 0; i < scores[1].length; i++) {
            sum2 += scores[1][i];
        }
        double avg2 = (double) (sum2 / total2);
        System.out.println("2반의 평균 점수는 " + avg2);
        System.out.println();

        //전체 학생들의 평균 구하기
        int sumTotal = 0;
        int totalstd = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sumTotal += scores[i][j];
            }
            totalstd += scores[i].length;

        }
        double avg3 = (double)(sumTotal / totalstd);
            System.out.println("전체 학생의 평균은 " + avg3);
    }
}
