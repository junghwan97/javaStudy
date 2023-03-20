package ch17.lecture.p03intermediate;

import java.util.Random;
import java.util.stream.Stream;

public class C05Distinct {
    public static void main(String[] args) {
        // 1 ~ 45 중 6개 랜덤
        Stream<Integer> stream = Stream.generate(()-> (int)(Math.random() * 45) + 1);


        stream
                .distinct()
                .limit(6)
                .forEach(System.out::println);

        // Random 클래스 사용
        System.out.println("Random 클래스 사용 +++++++++++++++++++++++++++++++++++++");
        Random random = new Random();
        Stream.generate(()-> random.nextInt(45) + 1)
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);
    }
}
