package ch06.sec08.exam01;

public class Calculator {

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    int plus(int x, int y) {
        int res = x + y;
        return res;
    }

    double divide(int x, int y) {
        double res = (double) x / (double) y;
        return res;
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}
