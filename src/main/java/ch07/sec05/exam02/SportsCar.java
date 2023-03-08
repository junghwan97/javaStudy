package ch07.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    // final method 재정의 불가
//    @Override
//    public void stop() {
//        speed += 10;
//    }
}
