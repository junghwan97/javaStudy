package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {

        // List 컬렉션 생성
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 85));
        studentList.add(new Student("홍길동", 92));
        studentList.add(new Student("홍길동", 87));

        // Student를 score 스트림으로 변환
        studentList.stream()
                .mapToInt(s -> s.getScore())
//                .mapToInt(new ToIntFunction<Student>() {
//                    @Override
//                    public int applyAsInt(Student value) {
//                        return value.getScore();
//                    }
//                })
                .forEach(score -> System.out.println(score));
//                .forEach(new IntStream.Builder() {
//                    @Override
//                    public void accept(int t) {
//                        System.out.println(t);
//                    }
//                    @Override
//                    public IntStream build() {
//                        return null;
//                    }

//                });
        System.out.println();
//        최대 점수, 최소 점수, 총합, 평균

        int max = studentList.stream()
                .mapToInt(Student::getScore)
                .max()
                .getAsInt();
        System.out.println(max);

        int min = studentList.stream()
                .mapToInt(Student::getScore)
                .min()
                .getAsInt();
        System.out.println(min);

        int sum = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println(sum);

        double avg = studentList.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println(avg);

        // 통계
        IntSummaryStatistics summary = studentList.stream()
                .mapToInt(Student::getScore)
                .summaryStatistics();
        System.out.println(summary);
        System.out.println("최대: " + summary.getMax());
        System.out.println("최소: " + summary.getMin());
        System.out.println("총합: " + summary.getSum());
        System.out.println("평균: " + summary.getAverage());
    }
}
