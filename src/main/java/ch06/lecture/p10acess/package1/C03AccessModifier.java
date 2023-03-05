package ch06.lecture.p10acess.package1;

public class C03AccessModifier {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
//      MyClass03 o2 = new MyClass03(3); private으로서 접근 안 됨
        MyClass03 o3 = new MyClass03("hello"); // package private으로서 접근 가능

    }
}
