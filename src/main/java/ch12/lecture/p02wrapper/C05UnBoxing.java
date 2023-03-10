package ch12.lecture.p02wrapper;

public class C05UnBoxing {
    public static void main(String[] args) {
        Integer i1 = 30; // auto boxing
        int i2 = 50;

        int i3 = i1 * i2; // 지금 버전에서는 가능

        int i4 = i1.intValue() * i2; // unboxing
        System.out.println(i3);
        System.out.println(i4);

    }
}
