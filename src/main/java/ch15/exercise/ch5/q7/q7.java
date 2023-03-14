package ch15.exercise.ch5.q7;

import java.util.List;

public class q7 {
    public static void main(String[] args) {
//    int[] array = {1, 5, 3, 8, 2};

        // of : 수정 불가 리스트 리턴
        List<Integer> list = List.of(1, 5, 3, 8, 2, 99);

        // 위 리스트의 최대값
        int max = Integer.MIN_VALUE;
        for (Integer list1 : list) {
            if (max < list1) {
                max = list1;
            }
//            max = Math.max(list1, max);
        }
        System.out.println(max);


    }
}
