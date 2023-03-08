package ch07.sec03.exam01;

public class Phone {
    private String model;
    private String color;

    public Phone(String model,String color){
        System.out.println("Phone() 생성자 실행");
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
