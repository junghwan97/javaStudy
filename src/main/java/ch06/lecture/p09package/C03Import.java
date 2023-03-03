package ch06.lecture.p09package;

import java.util.Scanner;
// import 생략 조건
// 1. java.lang 패키지 내 클래스 생략 가능 ex)String
// 2. 같은 패키지의 클래스 생략 가능


public class C03Import {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // import 생략 가능한 클래스들 사용
        //1.
        String str1 = new String("hello");
        String str2 = "world";
        //2.
        MyClass03 o1 = new MyClass03();

    }
}
