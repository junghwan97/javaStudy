package codeTest.programmers;

class Solution120826 {
    public String solution(String my_string, String letter) {
        String answer1 = my_string;
        String answer2 = answer1.replace(letter, "");
        return answer2;
    }
}