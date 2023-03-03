package ch06.exercise.exam13_15;

public class Member {
    String name;
    String id;
    String password;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    boolean login(String id, String password) {
        boolean res = false;
        if (id == "hong" && password == "12345") {
            res = true;
        }
        return res;
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 하셨습니다.");
    }
}
