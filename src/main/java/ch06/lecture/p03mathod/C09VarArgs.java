package ch06.lecture.p03mathod;

public class C09VarArgs {
    public static void main(String[] args) {
        MyClass09 o1 = new MyClass09();
        o1.method1();
        o1.method1(1);
        o1.method1(3, 5);
        System.out.println();
        o1.method2(new int[]{});
        System.out.println();
        o1.method2(new int[]{3});
        System.out.println();
        o1.method2(new int[]{5, 8});
        System.out.println();
        o1.method2(new int[]{9, 10, 100});
        System.out.println();
        o1.method3(5, 6, 7, 8, 9);
        o1.method3(new int[]{3, 4, 5, 6, 7, 8});
    }
}
