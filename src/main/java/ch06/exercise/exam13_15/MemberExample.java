package ch06.exercise.exam13_15;

public class MemberExample {
    public static void main(String[] args) {
        Member member1 = new Member("홍길동", "hong");
        boolean result = member1.login("hong", "123455");
        if (result) {
            System.out.println("로그인 되었습니다.");
            member1.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
        System.out.println(member1.name);
        System.out.println(member1.id);
        System.out.println(member1.password);
    }
}
