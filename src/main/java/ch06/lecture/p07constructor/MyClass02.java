package ch06.lecture.p07constructor;

public class MyClass02 {
    String model;
    int price;

    //생성자
    //인스턴스 만들 때 해야하는 일이 있는 코드 블럭
    //주로 필드 초기화
    // 생성자 이름은 클래스명과 같음

    MyClass02(/*String name, int price*/){
//        this.model = model;
//        this.price = price;
        System.out.println("인스턴스 만들 때 해야하는 일들....");
    }

    void description() {
        System.out.println(model + "모델 가격은 " + price + "원 입니다.");
    }
}
