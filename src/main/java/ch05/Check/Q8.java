package ch05.Check;

public class Q8 { // 199p 확인문제 8번
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            total += array[i].length;
        }
        double avg = (double) sum / total;
        System.out.println("배열의 전체 합은 " + sum);
        System.out.println("배열의 평균은 " + avg);
    }
}
