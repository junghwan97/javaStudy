package ch06.lecture.p03mathod;

public class MyClass12 {
    void method() {

        return;
        // 1. 메서드 종료
        // 2. 오른쪽 값을 호출한 곳으로 return(반환) / 반환 타입과 맞는 값을 return
//      return 3; 반환 값이 void로 설정되어 있기 때문에 오류
    }

    int method1() {
        return 2;
    }

    int method2() {
        // 메서드에 리턴 타입을 명시하면
        // 해당 타입의 값을 꼭 리턴해야함
        if (true) {
            return 3; //  if문 때문에 실행되지 않을 수 있다고 판단하여 오류
        }
        return 5;
    }

    // 자동 형변환
    int method3() {
        int a = 3;
        return a;
    }

    //    int method4(){
//        long a = 3l;
//        return a; // 자동 형변환 불가
//    }
    int method6() {
        short a = 6000;
        return a;
    }

    double method7() {
        double d = 3.14;
        return d;
    }

    double method8() {
        long a = 435l;
        return a;
    }

    // 리턴이 없으면 void로 리턴 타입 명시
    void method9(){
        return; // 만약 쓴다면 메서드 종료 역할로만 사용 가능
    }
}
