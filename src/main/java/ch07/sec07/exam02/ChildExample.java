package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = (Parent)child;

        parent.method1();
        parent.method2();
    }
}
