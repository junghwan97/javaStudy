package codeTest.programmers;

class Solution120913 {
    public String[] solution(String my_str, int n) {
        String str = my_str;
        int len = (my_str.length()) / n;
        String[] answer = new String[len];
        for(int i = 0; i < str.length(); i += n){
            for(int j = 0; j < len; j++){
                answer[j] = my_str.substring(i,i + n + 1);
            }
        }
        return answer;
    }
}