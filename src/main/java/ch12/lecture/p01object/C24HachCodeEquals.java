package ch12.lecture.p01object;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C24HachCodeEquals {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new MyClass24(1, "kim"));
        set.add(new MyClass24(2, "edman"));
        set.add(new MyClass24(1, "kim"));

        System.out.println(set.size());
    }
}

class MyClass24 {
    private int id;
    private String name;

    public MyClass24(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass24 myClass24 = (MyClass24) o;
        return id == myClass24.id && Objects.equals(name, myClass24.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}