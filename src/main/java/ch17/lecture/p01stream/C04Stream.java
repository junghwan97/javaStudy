package ch17.lecture.p01stream;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class C04Stream {
    public static void main(String[] args) {
        // collection -> stream
        Collection<Integer> set = Set.of(9,2,10,1,20,90,0,3);

        Stream<Integer> stream1 = set.stream();
        long count = stream1.count();
        System.out.println(count);

        Stream<Integer> stream2 = set.stream();
        Optional<Integer> max = stream2.max(Integer::compareTo);
        System.out.println(max.get());
    }
}
