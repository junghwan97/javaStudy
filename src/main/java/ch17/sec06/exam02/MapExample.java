package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        IntStream intStream = Arrays.stream(intArray);
        intStream
                .asDoubleStream()
                .forEach(d-> System.out.println(d));
//                .forEach(new DoubleConsumer() {
//                    @Override
//                    public void accept(double value) {
//                        System.out.println(value);
//                    }
//                });
        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream
                .boxed()
                .forEach(obj -> System.out.println(obj.intValue()));
//                .forEach(new Consumer<Integer>() {
//                    @Override
//                    public void accept(Integer integer) {
//                        System.out.println(integer.intValue());
//                    }
//                });
    }
}
