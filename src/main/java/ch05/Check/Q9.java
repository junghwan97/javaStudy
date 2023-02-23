package ch05.Check;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int stdNum = 0;
        int[] scores = null;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        double avg = 0;


        while (run) {
            System.out.println("=======================================================");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("=======================================================");
            System.out.print("선택> ");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.print("학생 수: ");
                stdNum = sc.nextInt();
                scores = new int[stdNum];
            } else if (a == 2) {
                for (int i = 0; i < stdNum; i++) {
                    System.out.print("scores[" + i + "]> ");
//                    scores = new int[stdNum]; // 여기서 초기화되면 반복해서 새로운 배열 생성
                    scores[i] = sc.nextInt();
                }
            } else if (a == 3) {
                for (int i = 0; i < stdNum; i++) {
                    System.out.println("scores[" + i + "]> " + scores[i]);
                }
            } else if (a == 4) {
                for (int i = 0; i < stdNum; i++) {
                    sum += scores[i];
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                }
                avg = (double) sum / stdNum;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            } else if (a == 5) {
                System.out.println("프로그램 종료");
                run = false;
            }
        }
    }
}

