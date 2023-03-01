package ch06.lecture.p06final;

public class C01Final {
    public static void main(String[] args) {
        // final : 값을 한번만 할당할 수 있다는 의미
        final int a = 3; // a는 3으로 고정

    }

    static void method(int i){
        System.out.println(i);
        i = 5;
        System.out.println(i);
    }
    static void method2(final int i){
        System.out.println(i);
//        i = 6; 이미 i는 고정됨
        System.out.println(i);
    }
}
