package ch07.lecture.p01inheritance;

public class SubClass04 extends SuperClass04{
    @Override  // 재정의한 메서드인지 컴파일러가 검증
    public void method1(){
        System.out.println("sub method1");
    }

    @Override
    public void method2() {
        System.out.println("sub method2");
    }
}
