package ch09.lecture.p02anonymous;

public class C07Anonymous {
    public static void main(String[] args) {
        MyInterface07 o1 = new MyClass07();
        o1.method01();
    }
}

class MyClass07 implements MyInterface07 {
    @Override
    public void method01() {
        System.out.println("재정의된 메서드");
    }
}

interface MyInterface07 {
    void method01();
}