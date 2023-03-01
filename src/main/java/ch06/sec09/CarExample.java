package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("Sonata");
        myCar.setSpeed(100);
        System.out.println(myCar.speed);
        myCar.run();
    }
}
