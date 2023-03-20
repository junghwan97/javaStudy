package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample { // p732
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권", "김미나"};
        Stream<String> strStream = Arrays.stream(strArray);
//        strStream.forEach(item-> System.out.print(item + ","));
        strStream.forEach(new Consumer<String>() {
            @Override
            public void accept(String item) {
                System.out.print(item + "," );
            }
        });
        System.out.println();

        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item-> System.out.print(item + ","));
        System.out.println();
    }
}