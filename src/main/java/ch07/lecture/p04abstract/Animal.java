package ch07.lecture.p04abstract;

// 추살 클래스
// 인스턴스 생성 불가
public abstract class Animal {

    // 추상 메서드
    // 몸통이 없는 메서드
    // 추상 메서드가 있는 클래스는 추상 클래스이어야 함
    // 상속받는 클래스에서 꼭 재정의 해야함
    public abstract void breath();
}
