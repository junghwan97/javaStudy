package codeTest.programmers;

public class Solution120908 {
    public int solution(String str1, String str2) {
        int answer = str1.indexOf(str2);

        if (answer != -1) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}