package ch05.Check;

public class Q8EnhacedFor {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int count = 0;
        double avg = 0.0;
        for (int[] n1 : array) {
            for (int n2 : n1) {
                sum += n2;
                count++;
            }
            avg = (double) sum / count;
        }
            System.out.println("배열의 총합은 " + sum);
            System.out.println("배열의 평균은 " + avg);
    }
}