package ch17.lecture.p03intermediate;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C13Boxed {
    public static void main(String[] args) {
        // boxed :
        // 기본 타입을 원소로 갖는 stream
        // ---> 참조타입을 원소로 갖는 stream 변환

        IntStream stream1 = IntStream.range(1,10);
        Stream<Integer> stream2 = stream1.boxed();

        DoubleStream stream3 = DoubleStream.of(3.14, 9.99);
        Stream<Double> stream4 = stream3.boxed();


    }
}
