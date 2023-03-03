package ch06.lecture.p10acess;

import ch06.lecture.p10acess.package1.MyClass02;

public class C02AccessModifier {

    public static void main(String[] args) {
        MyClass02 o1 = new MyClass02();
        System.out.println(o1.name);
//        System.out.println(o1.married); 접근 불가
        o1.method1();
//        o1.method3(); 접근 불가


    }
}
