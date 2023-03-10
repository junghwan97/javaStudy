package ch13.p01generic;

public class C03Diamond {
    MyClass03<String> o1 = new MyClass03<String>();

    // 인스턴스 만드는 타입으이 아규면트 생략 가능
    MyClass03<String> o2 = new MyClass03<>();


}
class MyClass03<T>{
    public T item;
}