package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C04polymorphism {
    public static void main(String[] args) {
        String s1 = "java";
        Scanner sc = new Scanner("");

        method1(s1);
        method1(sc);
    }

    public static void method1(Object o) {
//    o.charAt(9);
//    o.nextLine();
        String s = o.toString();

        System.out.println(s);
    }
}
