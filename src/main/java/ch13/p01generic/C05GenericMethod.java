package ch13.p01generic;

public class C05GenericMethod {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        o1.method("java");
        o1.<Integer>method(100);

    }
}
class MyClass05 {

    //generic method
    public <T> void method(T t){

    }
}