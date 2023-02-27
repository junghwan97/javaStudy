package ch06.lecture.p03mathod;

public class MyClass04 {

    void method1() {
        System.out.println("파라미터 없는 메서드");
    }

    void method2(int param1) {
        System.out.println("인티저 파라미터 " + param1 + " 받는 메서드");
    }

    void method3(String param1) {
        System.out.println("스트링 파라미터 " + param1 + " 받는 메서드");
    }

    void method4(int param1, int param2) {
        System.out.println("정수 파라미터 2개 받은 메서드");
    }

    void method5(String p1, String p2) {
        System.out.println("문자열 파라미터 2개 받는 메서드");
    }

    void method6(String p1, int p2) {
        System.out.println("문자열, 정수 하나씩 받는 메서드");
    }
}
