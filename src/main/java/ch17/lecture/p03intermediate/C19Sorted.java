package ch17.lecture.p03intermediate;

import java.util.Comparator;
import java.util.stream.IntStream;

public class C19Sorted {
    public static void main(String[] args) {
        IntStream.range(1,6)
                .boxed()
//                .mapToObj(Integer::valueOf)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
