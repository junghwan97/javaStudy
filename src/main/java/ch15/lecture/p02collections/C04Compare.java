package ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C04Compare {
    public static void main(String[] args) {
        List<Person04> list = new ArrayList<>();
        list.add(new Person04("kang", "20230315"));
        list.add(new Person04("seo", "20221203"));
        list.add(new Person04("chae", "20020605"));
        list.add(new Person04("song", "20121203"));
        list.add(new Person04("jung", "20210707"));

        // 나이 어릴수록 작은 index
//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);
        Collections.sort(list, (a,b)-> b.getBirth().compareTo(a.getBirth()));
        System.out.println(list);
    }
}

class Person04 implements Comparable<Person04> {
    private String name;
    private String birth;

    public Person04(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person04{" +
                "name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public int compareTo(Person04 o) {
        return this.birth.compareTo(o.birth);
    }
}