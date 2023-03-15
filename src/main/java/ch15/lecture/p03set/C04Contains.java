package ch15.lecture.p03set;

import java.util.Set;

public class C04Contains {
    public static void main(String[] args) {
        Set<String> set = Set.of("java", "css", "html", "jsp");

        // contains : 해당 원소가 이미 있는지?
        System.out.println(set.contains("java"));
        System.out.println(set.contains("jsp"));
        System.out.println(set.contains("python"));
        System.out.println(set.contains(new String("java"))); // hash와 equals가 재정의 되었는가??????????????
    }
}
