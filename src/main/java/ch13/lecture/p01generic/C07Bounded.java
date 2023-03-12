package ch13.lecture.p01generic;

import java.util.Scanner;

public class C07Bounded {
    public static void main(String[] args) {
        MyClass07<String> o1 = new MyClass07<>();
        o1.setItem("java");
        o1.printItem();

        MyClass07<Scanner> o2 = new MyClass07<>();
        o2.setItem(new Scanner(""));
        o2.printItem();

        MyClass07<Integer> o3 = new MyClass07<>();
        o3.setItem(99);
        o3.printItem();
    }
}

class MyClass07<T> {
    private T item;

    public void printItem() {
        // object의 메서드 안전하게 실행 가능
        // 왜냐하면 Object는 모든 클래스의 상위 클래스이기 때문
        String str = item.toString();
        int hashcode = item.hashCode();
        boolean equals = item.equals(null);
        System.out.println(str);
        System.out.println(hashcode);
        System.out.println(equals);
        System.out.println();
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}