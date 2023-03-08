package ch08.lecture.p03polymorphism;

public class C03Polymorphism {
    public static void main(String[] args) {
        Myinterface03[] arr = new Myinterface03[5];
        arr[0] = new MyClass03();
        arr[1] = new MyClass04();

    }
}
interface Myinterface03{}
class MyClass03 implements Myinterface03{}
class MyClass04 implements Myinterface03{}