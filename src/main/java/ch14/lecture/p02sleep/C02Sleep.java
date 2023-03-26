package ch14.lecture.p02sleep;

public class C02Sleep {
    public static void main(String[] args) {
        System.out.println("main thread start");
        Thread t = new Thread(() -> {
            System.out.println("thread start");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread end");
        });
        t.start();
        System.out.println("main thread end");
    }
}
