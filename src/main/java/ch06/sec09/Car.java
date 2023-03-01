package ch06.sec09;

public class Car {
    int speed;
    String model;

    Car(String model){
        this.model = model;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    void run(){
        this.setSpeed(100);
        System.out.println(this.model + "의 차랑은 시속" + this.speed + "km의 속력으로 달립니다.");
    }
}
