package ch06.lecture.p03mathod;

public class C13Return {
    public static void main(String[] args) {
        MyClass13 o1 = new MyClass13();
        int a = o1.method1();
        System.out.println(a);
        int b = o1.method1() * 2;
        System.out.println(b);
        System.out.println(o1.method1());

        String c = o1.method2();
        System.out.println(c);
        String d = o1.method2() + " java";
        System.out.println(d);

        // 자동 형변환
        long e = o1.method1();
        System.out.println(e);
        double f = o1.method1();
        System.out.println(f);
    }
}
