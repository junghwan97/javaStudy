package ch06.lecture.p07constructor;

public class C03Constructor {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        o1.name = "cha";
        o1.age = 70;

        MyClass03 o2 = new MyClass03();
        o2.name = "park";
        o2.age = 45;

        o1.description();
        o2.description();

    }
}
