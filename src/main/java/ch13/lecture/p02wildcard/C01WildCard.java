package ch13.lecture.p02wildcard;

public class C01WildCard {
    public static void main(String[] args) {
        MyClass01<Object> o1 = new MyClass01<Object>();
        MyClass01<String> o2 = new MyClass01<String>();

        o1.item = new Object();
        o2.item = new String();

        o1.item = new String();
//        o2.item = new Object();

//        MyClass01<Object> o3 = o2;
//        o3.item = new Object();
    }
}

class MyClass01<T> {
    public T item;
}