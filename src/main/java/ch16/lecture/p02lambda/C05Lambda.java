package ch16.lecture.p02lambda;



public class C05Lambda {
    public static void main(String[] args) {
        MyInterface05 o1 = new MyClass05();
        int r1 = o1.method1();

        MyInterface05 o2 = () -> {
            System.out.println("람다로 메서드 재정의");
            return 3;
        };
        int r2 = o2.method1();

        MyInterface05 o3 = () -> {

            return 4;
        };
        int r3 = o3.method1();

        MyInterface05 o4 = () -> /*return 생략*/5;
        int r4 = o4.method1();
    }
}

class MyClass05 implements MyInterface05 {
    @Override
    public int method1() {
        System.out.println("명령문 작성..");

        return 0;
    }
}

interface MyInterface05 {
    int method1();
}
