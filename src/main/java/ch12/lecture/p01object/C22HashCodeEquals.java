package ch12.lecture.p01object;

import java.util.Objects;

public class C22HashCodeEquals {
    public static void main(String[] args) {
        Object o1 = new MyClass22(1, "kim", "seoul", false);
        Object o2 = new MyClass22(1, "kim", "seoul", false);
        Object o3 = new MyClass22(1,"kim", "seoul", true);

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));

    }
}
class MyClass22{
    private int id;
    private String name;
    private String address;
    private boolean married;

    public MyClass22(int id, String name, String address, boolean married){
        this.id = id;
        this.name = name;
        this.address = address;
        this.married = married;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass22 myClass22 = (MyClass22) o;
        return id == myClass22.id && married == myClass22.married && Objects.equals(name, myClass22.name) && Objects.equals(address, myClass22.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, married);
    }
}