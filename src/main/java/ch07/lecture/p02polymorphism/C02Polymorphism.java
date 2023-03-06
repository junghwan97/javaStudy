package ch07.lecture.p02polymorphism;

public class C02Polymorphism {
    public static void main(String[] args) {
        SubClass02 o1 = new SubClass02();
        o1.method1(); // super method1
        o1.method2(); // sub method1

        SuperClass02 o2 = o1;
        o2.method1(); // super method1
//        o2.method2(); 참조변수의 타입으로 실행 가능한 메서드 결정
        SuperClass02 o3 = new SubClass022();
        o3.method1(); // super method1
    }
}

class SuperClass02 {
    public void method1() {
        System.out.println("super method1");
    }
}

class SubClass02 extends SuperClass02 {
    public void method2() {
        System.out.println("sub method1");
    }
}
class SubClass022 extends SuperClass02{
    public void method3(){
        System.out.println("sub method3");
    }
}
