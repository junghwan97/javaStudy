package ch15.lecture.p07treeset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class C02TreeSet {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();

        set.addAll(Set.of(3, 1, 10, 20, 3000, 15, 7, 9, 2500, 100));
        System.out.println(set);

        // first
        System.out.println(set.first());

        // last
        System.out.println(set.last());

        // lower
        System.out.println(set.lower(20));
        System.out.println(set.lower(50));

        // higher
        System.out.println(set.higher(50));

        // floor
        System.out.println("floor");
        System.out.println(set.floor(50));
        System.out.println(set.floor(20));

        //ceiling
        System.out.println(set.ceiling(50));
        System.out.println(set.ceiling(100));

        // 거꾸로 정력된 NavigableSet 리턴
        NavigableSet<Integer> descendingSet = set.descendingSet();
        System.out.println(descendingSet);




    }
}
