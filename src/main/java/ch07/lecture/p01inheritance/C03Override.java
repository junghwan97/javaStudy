package ch07.lecture.p01inheritance;

public class C03Override {
    public static void main(String[] args) {
        SubClass03 o1 = new SubClass03();
        o1.method1();
        o1.method2(); // 재정의한 메서드 실행
        o1.method3();
    }
}
