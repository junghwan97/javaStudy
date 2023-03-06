package ch07.exercise.q8;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = (Tire)snowTire;

        snowTire.run();
        tire.run(); // 업캐스팅 되었지만 메서드 오버라이딩 되어 위와 같이 출력
    }
}
