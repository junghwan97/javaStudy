package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C03Polymorphism {
    public static void main(String[] args) {

    String s1 = "hello";
    Object o1 = s1;

    Object o2 = "java";
    char c1 = s1.charAt(0);
    //    char c2 = o1.charAt(0); 안전하게 실행할 수 없기 때문에 실행 불가
    Scanner sc1 = new Scanner("");
    Object o3 = sc1;

    Object o4 = new Scanner("");
    sc1.nextLine();
//    o3.nextLine(); 안전하게 실행할 수 없기 때문에 실행 불가
    }

}

