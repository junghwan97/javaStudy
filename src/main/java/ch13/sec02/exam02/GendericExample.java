package ch13.sec02.exam02;

public class GendericExample {
    public static void main(String[] args) {
//        HomeAgency homeAgency = new HomeAgency();
        Home home = new HomeAgency().rent();
        home.turnOnLight();
        System.out.println();
        CarAngency carAngency = new CarAngency();
        Car car = carAngency.rent();
        car.run();
    }
}
