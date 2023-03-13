package ch16.lecture.p02lambda;

public class C02Lambda {
    public static void main(String[] args) {
        // 파라미터가 없으면 빈 ()
        // 메서드 body는 {}
        MyInterface01 o1 = () -> {
            // 메서드 body
            System.out.println("method body");
        };
        o1.method1();

        // 메서드의 명령문이 하나이면 중괄호 생략 가능
        MyInterface01 o2 = ()-> {
            System.out.println("명령문 여러개");
            System.out.println("명령문 여러개");
        };
        o2.method1();

        // 생략 가능하면 {} 생략
        // lambda는 생략할수록 읽기 쉼다
        MyInterface01 o3 = ()-> System.out.println("명령문 하나");
        o3.method1();
    }
}

@FunctionalInterface
interface MyInterface01 {

    // 파라미터가 없는 추상 메서드
    void method1();
}