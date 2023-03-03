package ch06.lecture.p11capsule;

public class C02Encapulation {
    public static void main(String[] args) {
        MyClass02 o1 = new MyClass02();
        System.out.println("나이는 " + o1.getAge());
        o1.update();
        System.out.println("나이는 " + o1.getAge());
        o1.update();
        System.out.println("나이는 " + o1.getAge());



    }
}
