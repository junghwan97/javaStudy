package ch06.sec08.exam01;

public class CalculaotrExample {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.powerOn();
        int result1 = cal1.plus(1, 5);
        System.out.println("result1 : " + result1);
        double result2 = cal1.divide(9, 3);
        System.out.println("result2 : " + result2);
        cal1.powerOff();
    }
}
