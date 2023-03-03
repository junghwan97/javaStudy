package ch06.lecture.p07constructor;

public class C01Constructor {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        // 인스턴스 만들자 마자 해야하는 일 (주로 필드 초기화)
        o1.name = "son";
        o1.age = 30;

        MyClass01 o2 = new MyClass01();
        o2.name = "cha";
        o2.age = 70;

        o1.description();
        o2.description();
        
    }
}

