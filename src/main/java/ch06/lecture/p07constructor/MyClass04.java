package ch06.lecture.p07constructor;

public class MyClass04 {
    String model;
    int price;

    MyClass04(String model, int price){
        this.model = model;
        this.price = price;
    }
    void desc(){
        System.out.println(model + "모델의 가격은 " + price + "만원 입니다.");
    }
}
