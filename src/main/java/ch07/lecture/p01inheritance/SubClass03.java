package ch07.lecture.p01inheritance;

public class SubClass03 extends SuperClass03{
        //method1, 2 상속받음

        // 필요하면  상속받은 method 재정의 가능
    public void method2(){
        System.out.println("서브클래스 메서드2");
    }
    public void method3(){
        System.out.println("서브클래스 메서드3");
    }
}
