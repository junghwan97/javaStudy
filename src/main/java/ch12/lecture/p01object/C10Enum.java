package ch12.lecture.p01object;

public class C10Enum {
    public static void main(String[] args) {
        System.out.println(MyClass10.SPRING);
        System.out.println(MyClass10.SUMMER);
        System.out.println(MyClass10.FALL);
        System.out.println(MyClass10.WIINTER);
    }
}
class MyClass10{
    final static int SPRING = 1;
    final static int SUMMER = 2;
    final static int FALL = 3;
    final static int WIINTER = 4;
}