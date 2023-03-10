package ch12.exercise.q8;

public class Q8 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] scores = new int[1000];
        for (int i = 0; i < scores.length; i++){
            scores[i] = i;
        }
        int sum = 0;
        for (int score : scores){
            sum += score;
        }
        double avg = sum / scores.length;
        long end = System.nanoTime();
        long result = end - start;
        System.out.println(result);
        System.out.println(avg);

    }
}
