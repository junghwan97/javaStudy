package ch08.lecture.p05cast;

public class C01Cast {
    public static void main(String[] args) {
        MyInterface01 o1 = new MyClass01();
        MyClass01 o2 = (MyClass01) o1;
        o2.method1();
    }
}
