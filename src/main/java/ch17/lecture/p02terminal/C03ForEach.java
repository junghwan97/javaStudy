package ch17.lecture.p02terminal;

import java.util.List;
import java.util.function.Consumer;

public class C03ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "html", "jsp");

        list.stream()
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });
//                .forEach(s -> System.out.println(s));

        list.stream()
                .forEach(s -> System.out.println("원소 :" + s));

    }
}
