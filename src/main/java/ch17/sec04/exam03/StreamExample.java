package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample { // p733
    public static int sum; // 로컬 클래스는 final

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
//        stream.forEach(a-> sum += a);
        stream.forEach(new IntStream.Builder() {
            @Override
            public void accept(int t) {
                sum += t;
            }

            @Override
            public IntStream build() {
                return null;
            }
        });
        System.out.println("총합 : " + sum);
    }
}
