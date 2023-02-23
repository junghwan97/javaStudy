package ch05.exercise;

public class Ex15 { // 159p
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int len = ssn.length();
        if (len == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 맞지 않습니다.");
        }
    }
}
