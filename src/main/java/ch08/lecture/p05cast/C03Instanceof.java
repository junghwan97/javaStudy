package ch08.lecture.p05cast;

public class C03Instanceof {
    public static void main(String[] args) {
        MyInterface02 o1 = new MyClass021();
        MyInterface02 o2 = new MyClass022();

        boolean a = o1 instanceof MyClass021; // trye
        boolean b = o1 instanceof MyInterface02; // true
        boolean c = o1 instanceof MyClass022; // false

        boolean d = o2 instanceof MyClass022; // true
        boolean e = o2 instanceof MyInterface02; // true
        boolean f = o2 instanceof MyClass021; // false

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }


}
