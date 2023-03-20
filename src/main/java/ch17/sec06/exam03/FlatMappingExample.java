package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");

        list1.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
//                .split() : 주어진 단위로 문자열을 분해하여 String배열로 작성
//                 Arrays.stream() 메서드는 주어진 String[] 배열을 Stream<String> 로 만듦

//                .flatMap(new Function<String, Stream<?>>() {
//                    @Override
//                    public Stream<?> apply(String s) {
//                        return Arrays.stream(s.split(" "));
//                    }
//                })
                .forEach(word -> System.out.println(word));
//                .forEach(new Consumer<Object>() {
//                    @Override
//                    public void accept(Object o) {
//                        System.out.println(o);
//                    }
//                });
        List<String> list2 = Arrays.asList("10,20,30,40,50");
        list2.stream()
//                .flatMapToInt(data -> {
//                    String[] strArr = data.split(",");
//                    int[] intArr = new int[strArr.length];
//                    for (int i = 0; i < strArr.length; i++) {
//                        intArr[i] = Integer.parseInt(strArr[i].trim());
//                    }
//                    return Arrays.stream(intArr);
//                })
                .flatMap(s->Arrays.stream(s.split(",")))
                .map(s->s.trim())
                .mapToInt(Integer::parseInt)
                .forEach(number -> System.out.println(number));
        System.out.println( );

        list2.stream()
                .flatMap(s->Arrays.stream(s.split("\\s*, \\s*")))
                .mapToInt(Integer::parseInt)
                .forEach(System.out::println);

    }
}
