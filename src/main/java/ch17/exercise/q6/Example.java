package ch17.exercise.q6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        int count = 0;
        int sum = 0;
        double avg1 = 0;
        for (Member e : list){
            sum += e.getAge();
            count++;
            avg1 = (double) (sum / count);
        }
        System.out.println("평균나이: " + avg1);

        double avg2 = list.stream()
        .collect(Collectors.averagingDouble(Member::getAge));
//   ==           .mapToInt(Member::getAge)
//                .average()
//                .getAsDouble();
        System.out.println("평균나이: " + avg2);
    }
}
