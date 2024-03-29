package ch17.lecture.p03intermediate;

import java.util.List;
import java.util.stream.Stream;

public class C14FlatMap {
    public static void main(String[] args) {
        // flatMap
        // 원래 원소를 다른 원소들로 매핑

        List<Integer> list = List.of(3, 4, 5);

        // map : 1대1
        long count1 = list.stream()
                .map(e -> e)
                .count();
        System.out.println(count1);

        // flatMap : 1대 다
        long count2 = list.stream()
                .flatMap(e -> Stream.of(0, 0))
                .count();
        System.out.println(count2);
    }
}
