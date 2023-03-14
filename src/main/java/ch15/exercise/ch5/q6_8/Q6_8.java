package ch15.exercise.ch5.q6_8;

import java.util.List;

public class Q6_8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        List<List<Integer>> list = List.of(
                List.of(95, 86),
                List.of(83, 92, 96),
                List.of(78, 83, 93, 87, 88));

        //문제6
        System.out.println(list.size()); // 3
        System.out.println(list.get(2).size()); // 5

        // 문제 8
        // 합, 평균 구하기
        int sum = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                sum += list.get(i).get(j);
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println(sum);
        System.out.println(avg);

    }
}
