package ch06.lecture.p07constructor;

public class MyClass11 {
    final String name = "nick";
    final int age; // 생성자에서 값 할당해야 함

    MyClass11(){
        this(99);
    }
    MyClass11(int age){
        this.age = age;
    }
}
