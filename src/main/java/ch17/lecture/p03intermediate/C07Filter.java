package ch17.lecture.p03intermediate;

import java.util.List;

public class C07Filter {
    public static void main(String[] args) {
        // filter : 걸러내기
        List<Integer> list = List.of(3, 9, -1, 0, 2, -3, -6, 7, 8);

        // 양수만
        list.stream()
                .filter(s -> s > 0)
                .forEach(System.out::println);
        System.out.println();
        // 짝수만
        list.stream()
                .filter(s -> (s % 2) == 0)
                .forEach(System.out::println);
        System.out.println();
        // 홀수만
        list.stream()
                .filter(s -> (s % 2) != 0)
                .forEach(System.out::println);
    }
}
