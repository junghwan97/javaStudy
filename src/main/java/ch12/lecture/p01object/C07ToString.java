package ch12.lecture.p01object;

public class C07ToString {

    public static void main(String[] args) {
    Object o1 = new MyClass07("son", 31, "london", false);
    Object o2 = new MyClass07("park", 40, "london", true);

    o1.toString();
    o2.toString();

    }
}
class MyClass07{
    private String name;
    private int age;
    private String address;
    private boolean married;

    public MyClass07(String name, int age, String address, boolean married) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.married = married;
    }
    @Override
    public String toString() {
        return "MyClass07 [name = " + name + "age = " + age + "address = " + address + "married = " + married + "]";
    }
}
