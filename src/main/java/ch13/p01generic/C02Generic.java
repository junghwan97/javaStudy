package ch13.p01generic;

import java.util.Scanner;

public class C02Generic {
    public static void main(String[] args) {
        MyClass02<String> o1 = new MyClass02<String>();
        o1.setItem("java");
        String s1 = o1.getItem();
        System.out.println(s1.length());

        MyClass02<Scanner> o2 = new MyClass02<Scanner>();
        o2.setItem(new Scanner(""));
        Scanner sc = o2.getItem();
        System.out.println(sc.nextLine());

        // 기본타입은 타입 아규면트로 사용 불가하므로 wrapper type로 사용

        MyClass02<Integer> o3 = new MyClass02<>();
        o3.setItem(3); // auto boxing
        int i = o3.getItem(); // unboxing
        System.out.println(sc.nextLine());
    }

}

// generic type
// T : type parameter
// type parameter 명 작성 관습 : 대문자 한글자
class MyClass02<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}