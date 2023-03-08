package ch12.lecture.p01object;

public class C05ToString {

    public static void main(String[] args) {
        Object o1 = new MyClass05();
        Object o2 = new MyClass05();

        System.out.println(o1.toString());
        System.out.println(o2.toString());

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));
    }

}

class MyClass05 {
    @Override
    public String toString() {
        return "내가 만든 설명";
    }
}
