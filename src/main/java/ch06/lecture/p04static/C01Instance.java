package ch06.lecture.p04static;

public class C01Instance {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.age = 20;
        o1.name = "nick";
        o1.greeting();

        MyClass01 o2 = new MyClass01();
        o2.age = 29;
        o2.name = "tomas";
        o2.greeting();
    }
}
