package ch13.lecture.p02wildcard;

public class C03WildCard {
    public static void main(String[] args) {
        MyClass03<? super Number> o1 = new MyClass03<Number>();
        MyClass03<? super Number> o2 = new MyClass03<Object>();
//        o1.item = new Number(); // 가능하지만 추상클래스라 인스턴스 생성불가
        o1.item = new Integer(1);
        o2.item = new Integer(3);
//        o1.item = new Object();

        MyClass03<? extends Number> o3 = new MyClass03<Number>();
        MyClass03<? extends Number> o4 = new MyClass03<Integer>();
        MyClass03<? extends Number> o6 = new MyClass03<Double>();

        Number n1 = o4.item;
        Object o5 = o4.item;
//        Integer i1 = o4.item;

    }
}

class MyClass03<T> {
    public T item;
}