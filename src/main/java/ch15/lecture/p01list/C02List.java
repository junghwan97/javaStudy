package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02List {
    public static void main(String[] args) {
        // list 전체 탐색
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");
        list.add("spring");
        list.add("react");

        // for
        System.out.println("for############");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // 향상된 for문
        System.out.println("향상된 for @@@@@@@@@@@@@@@@@@@");
        for (String e : list){
            System.out.println(e);
        }

        //Iterator
        System.out.println("Iterator $$$$$$$$$$$$$$$$$$$$$");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        // for each메서드
        System.out.println("forEach 메서드 %%%%%%%%%%%%%%%%%%%");
        list.forEach(e -> System.out.println(e));

        // forEach 메서드
        System.out.println("forEach 메서드^^^^^^^^^^^^^");
        list.forEach(System.out::println);
    }
}
