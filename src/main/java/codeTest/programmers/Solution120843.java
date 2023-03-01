package codeTest.programmers;

public class Solution120843 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        while (--k > 0) {
            answer += 2;
        }
        return numbers[answer % numbers.length];

    }
}
