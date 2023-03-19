package ch17.lecture.p01stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class C06Stream {
    public static void main(String[] args) {
        // 원소가 참조타입인 스트림
        Stream<String> stream1 = Stream.of("java", "spring", "css");

        // 원소가 기본타입인 스트림
        IntStream stream2 = IntStream.of(3, 9, 10, 1);
        LongStream stream3 = LongStream.of(3, 9, 10, 1);
        DoubleStream stream4 = DoubleStream.of(3, 14, 9.2345, 10.44, 1.6);
        int[] intarr = {9,10,11,12};
        IntStream stream5 = Arrays.stream(intarr);
//        Stream<IntStream> stream6 = Arrays.stream(intarr); x


    }
}
