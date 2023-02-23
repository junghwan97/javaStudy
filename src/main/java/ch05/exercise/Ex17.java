package ch05.exercise;

public class Ex17 { // 161p
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0,6);

        String secondNum = ssn.substring(7,ssn.length());

        System.out.println(firstNum);
        System.out.println(secondNum);
    }
}
