package ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02Compare {
    public static void main(String[] args) {
        List<Person02> list1 = List.of(new Person02("son", 30),
                                       new Person02("cha", 50),
                                       new Person02("park", 40));
        List<Person02> list2 = new ArrayList<>(list1);

        // Comparator.compare
        // 다음 3개 중 하나의 값 리턴
        // 음수 : 첫번째 매개값이 작을 때
        // 0 : 두 값이 같으면
        // 양수 : 첫 번째 매개값이 클 때

        // 나이 많은 순
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Comparator.html#compare(T,T)
        Person02 maxAge = Collections.max(list2, (a, b) -> a.getAge() - b.getAge());
        System.out.println(maxAge);

        // 나이 어린 순
        Person02 minAge = Collections.min(list2, (a, b) -> a.getAge() - b.getAge());
        System.out.println(minAge);

        System.out.println(list2);
        Collections.sort(list2, (x, y) -> x.getAge() - y.getAge());
        System.out.println(list2);

        // 이름순 정렬
        Collections.sort(list2, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(list2);

    }
}

class Person02 {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
