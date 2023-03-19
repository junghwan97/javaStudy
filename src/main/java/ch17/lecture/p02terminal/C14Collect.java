package ch17.lecture.p02terminal;

import java.util.List;
import java.util.stream.Collectors;

public class C14Collect {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 5, 9, 10);
        List<Integer> r1 = list.stream()
                .collect(Collectors.toList());

        System.out.println(r1);
    }
}
