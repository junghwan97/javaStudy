package ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01Collections {
    public static void main(String[] args) {
        List<String> list1 = List.of("java", "css", "spring", "jsp", "html"); // 수정 불가
        List<String> list2 = new ArrayList<>(list1); // 수정 가능 리스트로 다시 만듦- ArrayList(Collection<? extends E> c)

        // sort
        Collections.sort(list2);
        System.out.println(list2);

        // max
        String maxStr = Collections.max(list1);
        System.out.println(maxStr);

        // min
        String minStr = Collections.min(list1);
        System.out.println(minStr);

        // reverse
        Collections.reverse(list2);
        System.out.println(list2);

        // fill
        Collections.fill(list2, "web");
        System.out.println(list2);
    }
}
