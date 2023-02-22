package ch05.exercise;

public class Ex5 { // 182p
    public static void main(String[] args) {
       //수학
        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("mathScores : [" + i + "][" + j + "]:" + mathScores[i][j]);
            }
        }
        mathScores[0][0] = 90;
        mathScores[0][1] = 95;
        mathScores[0][2] = 100;
        mathScores[1][0] = 80;
        mathScores[1][1] = 85;
        mathScores[1][2] = 90;

        // 전체학생 평균
        int sum1 = 0;
        int count1 = 0;
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                sum1 += mathScores[i][j];
            }
            count1 += mathScores[i].length;
        }
        double avg = (double) (sum1 / count1);
        System.out.println("수학점수의 총합은 : " + sum1);
        System.out.println("수학점수들의 평균은 : " + avg);


        System.out.println();

        //국어
        int[][] koreanScores = new int[2][];
        koreanScores[0] = new int[2];
        koreanScores[1] = new int[3];
        for (int i = 0; i < koreanScores.length; i++) {
            for (int j = 0; j < koreanScores[i].length; j++) {
                System.out.println("koreanScores : [" + i + "][" + j + "]:" + koreanScores[i][j]);
            }
        }
        koreanScores[0][0] = 90;
        koreanScores[0][1] = 95;
        koreanScores[1][0] = 80;
        koreanScores[1][1] = 85;
        koreanScores[1][2] = 90;

        int sum2 = 0;
        int count2 = 0;
        for (int i = 0; i < koreanScores.length; i++) {
            for (int j = 0; j < koreanScores[i].length; j++) {
                sum2 += koreanScores[i][j];
            }
            count2 += koreanScores[i].length;
        }
        double avg1 = (double) (sum2 / count2);
        System.out.println("국어점수의 총합은 : " + sum2);
        System.out.println("국어점수들의 평균은 : " + avg1);
    }
}
