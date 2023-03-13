package ch16.lecture.p02lambda;

public class C01Lambda {
    public static void main(String[] args) {
        // functional interface로 lambda 식 만들 수 있음
        MyInterface02 o1 = () -> System.out.println("재정의 메서드");
        o1.method1();

        MyInterface02 o2 = () -> System.out.println("또다른 메서드");
        o2.method1();

    }
}

// Lambda expression
// 추상 메서드가 하나인 interface의 익명 클래스 객체 만드는 코드
// functional interface : 추상 메서드가 하나인 interface

@FunctionalInterface
interface MyInterface02{
    void method1();

    // object에 있는 메서드는 추상메서드 수에 포함 안됨
    String toString();

    default void method2(){

    }
    static void method3(){

    }
}