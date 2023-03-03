package ch06.lecture.p07constructor;

public class C08Constructor {
    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08("nick", 27, "2000-01-01", false);
        MyClass08 o2 = new MyClass08("tom", 27, null, false);
        o2.birthDate = "2000-05-05";

        MyClass08 o3 = new MyClass08("john", 27, false);
    }
}
