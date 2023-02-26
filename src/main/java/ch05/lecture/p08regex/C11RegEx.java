package ch05.lecture.p08regex;

public class C11RegEx {
    public static void main(String[] args) {
        //참고 https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html#sum
        //010으로 시작하고 -기호, 숫자  4개, -기호, 숫자 4개
        String pattern = "010-[0-9]{4}-[0-9]{4}";
        System.out.println("010-9999-9999".matches(pattern));
        System.out.println("010-9562-4349".matches(pattern));
        System.out.println("010-5343-7853".matches(pattern));
    }
}
