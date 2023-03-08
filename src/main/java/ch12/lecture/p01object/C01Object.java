package ch12.lecture.p01object;

import java.util.ArrayList;
import java.util.Scanner;

public class C01Object {
    // Object class
    // 모든 클래스의 상위 클래스

    public static void main(String[] args) {
        String s1 = "java";
        Object o1 = s1;

        Scanner sc = new Scanner("");
        Object o2 = sc;

        ArrayList list = new ArrayList();
        Object o3 = list;

        C01Object o4 = new C01Object();
        Object o5 = o4;

        Object o6 = new MyClass01();

        // 심지어 기본타입도 Object이다
        int i = 4;
        Object o7 = i;

    }
}

class
MyClass01 extends Object {

}