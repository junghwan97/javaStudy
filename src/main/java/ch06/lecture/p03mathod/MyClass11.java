package ch06.lecture.p03mathod;

public class MyClass11 {
    void method1() {
        System.out.println("실행문1");
        System.out.println("실행문2");
        System.out.println("실행문3");

        return; // 메서드를 종료시킴
        // System.out.println("실행문4"); 실행 안됨
    }
    void method2(){
        System.out.println(1);

        if (true){
            return; // 메서드 종료
        }
        System.out.println(2); // 앞에 return을 만나 실행되지 않는 명령문
    }
}
