package ch05.lecture.p08regex;

public class C05RegEx {
    public static void main(String[] args) {
        // character class
        System.out.println("a".matches("[abcdefghijklmnopqrstuvwxyz]"));
        System.out.println("a".matches("[a-z]")); // 위의 형식과 같음


    }
}
