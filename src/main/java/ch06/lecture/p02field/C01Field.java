package ch06.lecture.p02field;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 var1 = new MyClass01();
        var1.age = 20;
        var1.name = "nick";
        var1.score = 100;

        System.out.println(var1.name + "의 나이는 " + var1.age + "살이며 점수는 " + var1.score + "점입니다.");

        MyClass01 var2 = new MyClass01();
        var2.age = 22;
        var2.name = "cha";
        var2.score = 95;
        System.out.println(var1.name + "의 나이는 " + var1.age + "살이며 점수는 " + var2.score + "점입니다.");
    }
}
