package ch12.lecture.p02wrapper;

public class C06UnBoxing {
    public static void main(String[] args) {
        int i1 = 30000;
        int i2 = 30000;

        Integer o1 = i1;
        Integer o2 = i2;

        System.out.println(o1 == o2);

        int i3 = o1; // auto unboxing
        int i4 = o2; // auto unboxing
        System.out.println(i3 == i4);
    }
}
