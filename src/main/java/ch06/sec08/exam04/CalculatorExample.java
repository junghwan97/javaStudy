package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        double res1 = cal1.areaRectangle(10);
        double res2 = cal1.areaRectangle(10,20);

        System.out.println("정사각형의 넓이는 " + res1);
        System.out.println("직사각형의 넓이는 " + res2);
    }
}
