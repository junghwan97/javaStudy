package ch06.lecture.p03mathod;

public class C03Method {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        MyClass03 o2 =new MyClass03();

        o1.greeting();
        o1.name = "Nick";
        o1.greeting();

        o2.greeting();
        o2.name = "tomas";
        o2.greeting();
    }
}
