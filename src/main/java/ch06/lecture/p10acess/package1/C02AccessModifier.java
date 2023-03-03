package ch06.lecture.p10acess.package1;

public class C02AccessModifier {
    public static void main(String[] args) {
        MyClass02 o1 = new MyClass02();
        System.out.println(o1.name);
//        System.out.println(o1.age); 접근 불가
        System.out.println(o1.married);
        o1.method1();
//        o1.method2(); 접근 불가
        o1.method3();
    }
}
