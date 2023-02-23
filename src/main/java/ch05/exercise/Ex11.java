package ch05.exercise;

public class Ex11 { // 156p
    public static void main(String[] args) {
        String str1 = "nick";
        String str2 = "nick";

        if (str1 == str2){
            System.out.println("str1과 str2는 참조가 같음"); // 출력
        }
        else {
            System.out.println("str1과 str2는 참조가 다름"); // false
        }
        if (str1.equals(str2)){
            System.out.println("str1과 str2의 문자열이 같음"); // 출력
        }

        String str3 = new String("nick");
        String str4 = new String("nick");

        if (str3 == str4){
            System.out.println("str3과 str4는 참조가 같음"); // false
        }
        else {
            System.out.println("str3과 str4는 참조가 다름"); // 출력
        }
        if (str3.equals(str4)){
            System.out.println("str3과 str4의 문자열이 같음"); // 출력
        }

    }
}
