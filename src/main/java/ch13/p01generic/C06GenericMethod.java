package ch13.p01generic;

public class C06GenericMethod {
    public static void main(String[] args) {
    MyClass06 o1 = new MyClass06();
        o1.method();
        o1.<String>method();
        o1.<Integer>method();

        String s3 = o1.method();
        Integer s4 = o1.method();
    }

}
class MyClass06{
    public <T> T method(){
        return null;
    }
}