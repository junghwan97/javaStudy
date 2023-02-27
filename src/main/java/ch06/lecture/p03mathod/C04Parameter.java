package ch06.lecture.p03mathod;

public class C04Parameter {
    public static void main(String[] args) {
        MyClass04 o1 = new MyClass04();
        o1.method1();

        // 메서드 실행시 정의된 파라미터 타입과 순서, 개수에 맞처서
        // 아규먼트 입력(전달)
//        o1.method1(3); // error
        o1.method2(10);

        String str = "hello";
        o1.method3(str);
        o1.method3(null);


    }
}
