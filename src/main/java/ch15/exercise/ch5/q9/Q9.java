package ch15.exercise.ch5.q9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        boolean run = true;
        int num = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        List<Integer> scores = new ArrayList<>();
        while (run) {
            System.out.println("=========================================================");
            System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("=========================================================");
            System.out.print("선택> ");
            int a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.print("학생 수> ");
                    num = sc.nextInt();
                }
                case 2 -> {
                    for (int i = 0; i < num; i++) {
                        System.out.print("scores[" + i + "]> ");
                        scores.add(i, sc.nextInt());
                    }
                }
                case 3 -> {
                    for (int i = 0; i < num; i++) {
                        System.out.println("scores[" + i + "]: " + scores.get(i));
                    }
                }
                case 4 -> {
                    for (Integer e : scores) {
                        if (max < e) {
                            max = e;
                        }
                        sum += e;
                    }

                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + (double) (sum / num));
                }
                case 5 -> {
                    System.out.println("프로그램 종료");
                    run = false;
                }
            }
        }
    }
}