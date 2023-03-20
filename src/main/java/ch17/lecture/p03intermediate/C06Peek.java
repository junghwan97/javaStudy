package ch17.lecture.p03intermediate;

import java.util.Random;

public class C06Peek { // 주로 연산과 연산 사이에 결과를 확인하고 싶을 때 사용 (디버깅 용도)
    public static void main(String[] args) {

        (new Random()).ints(5)
                .peek(System.out::println)
                .forEach(System.out::println);

    }
}
