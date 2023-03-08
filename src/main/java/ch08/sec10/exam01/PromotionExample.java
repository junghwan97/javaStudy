package ch08.sec10.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a;

        a = (A)b; // A <- B (자동 타입 변환)
        a = (A)c; // A <- C (자동 타입 변환)
        a = (A)d; // A <- D (자동 타입 변환)
        a = (A)e; // A <- E (자동 타입 변환)
    }
}
