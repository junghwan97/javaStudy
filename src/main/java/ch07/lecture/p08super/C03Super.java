package ch07.lecture.p08super;

public class C03Super {
}

class Super03 {
    Super03(int i) {
    }

}

class Sub03 extends Super03 {
    Sub03() {
        // 자동으로 삽입되는 상위클래스 기본 생성자 호출 코드는 동작하지 않음
        // 따라서 명시적 호출
        super(1);
    }
}
