package ch16.lecture.p01anonymous;

public class C02Lambda {
    public static void main(String[] args) {
                        // (매개변수목록) -> {함수 몸체}
        MyInterface02 o1 = () -> System.out.println("재정의된 메서드");
        o1.method1();
    }
}

interface MyInterface02 {
    void method1();
}