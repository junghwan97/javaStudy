package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumthread = new SumThread();
        sumthread.start();
        try {
            sumthread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1~100까지의 합: " + sumthread.getSum());
    }
}
