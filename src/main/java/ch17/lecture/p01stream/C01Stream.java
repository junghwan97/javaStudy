package ch17.lecture.p01stream;

import java.util.stream.Stream;

public class C01Stream {
    public static void main(String[] args) {
        // 여러 원소(element)를
        // 순차적 처리 기능(메서드)을 제공하는 Class, interface

        // 스트림 만들기
        Stream<Integer> stream1 = Stream.of(5, 1, 4, 9, 10, 0);

        // 스트림 메서드 (연산)
        // 1. 최종 연산 (terminal operation)
        // 리턴 타입 : Stream 아님 (무조건은 아님)
        // 최종 연산시 중간 연산도 같이 실행됨

        // 개수 세기 (count)
        stream1.count();
        stream1.findFirst(); // 최종 연산 후 재사용 불가

        // 2. 중간 연산 (intermediate operation)
        // 리턴 타입 : Stream (무조건은 아님)


    }
}
