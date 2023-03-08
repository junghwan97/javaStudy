package ch07.lecture.p06final;

public class C03FinalMethod {
}

class Super03{
    public void method1(){}

    //final method 재정의 불가
    final public void method2(){}
}

class Sub03 extends Super03{
    @Override
    public void method1() {
        System.out.println("sub method1 재정의");
    }
//    @Override
//    public void method2() {
//        System.out.println("sub method2 재정의");
//    }
}
