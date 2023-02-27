package ch06.exercise.exam13_15;

public class Member {
    String name;
    String id;
    String password;
    int age;

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
