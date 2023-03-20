package ch17.exercise.q5;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Experssions",
                "Java8 supports lambda experssions"
        );

        // 고전적인 방법
//        for (String e : list){
//            if (e.toLowerCase().contains("java")){
//                System.out.println(e);
//            }
//        }
        list.stream()
                .filter(Example::havingJava)
//                .filter(item -> item.toLowerCase().contains("java"))
                .forEach(System.out::println);
//                .forEach(item-> System.out.println(item));

    }
        private static boolean havingJava(String s){
            return s.toLowerCase().contains("java");
        }
}
