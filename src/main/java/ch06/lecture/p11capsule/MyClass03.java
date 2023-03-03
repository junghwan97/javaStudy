package ch06.lecture.p11capsule;

public class MyClass03 {
    private String name;
    private int age;
    private String address;
    private boolean married;

    // boolean 타입의 getter는 is로 시작
    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    // 메서드를 통해서 필드에 접근하도록

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
