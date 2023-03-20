package ch17.lecture.p03intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class C04Distinct {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(0);
        list.add(0);

        System.out.println(list);

        Stream<Integer> stream1 = list.stream();

        Stream<Integer> stream2 = stream1.distinct();

        list.add(2); // 중간에 컬렉션을 변경하는 코드는 부적절

        long count1 = stream2.count(); // 최종 연산이 실핼될 때야 중간 연산이 한번에 실행됨
        System.out.println(count1);

    }
}
