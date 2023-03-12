package ch13.sec02.exam02;

public class CarAngency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car();
    }
}
