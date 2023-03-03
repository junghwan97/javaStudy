package ch06.lecture.p10acess;

public class C01AccessModifier {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.name = "son";
        System.out.println(o1.name);
//      System.out.println(o1.age); 접근 불가

        o1.method1();
//      o1.method2(); 접근 불가
    }
}
