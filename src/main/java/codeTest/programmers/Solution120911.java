package codeTest.programmers;

import java.util.Arrays;

public class Solution120911 {
    public String solution(String my_string) {
        String lower = my_string.toLowerCase() ;
        char[] stringChar = lower.toCharArray();
        Arrays.sort(stringChar);
        String answer = "";
        answer = new String(stringChar);
        return answer;
    }
}
