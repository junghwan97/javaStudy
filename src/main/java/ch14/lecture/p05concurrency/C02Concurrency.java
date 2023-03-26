package ch14.lecture.p05concurrency;

public class C02Concurrency {
    // synchronized block (동기화 블럭)

    static int field = 0;

    public static void main(String[] args) {
        // intrinsic lock
        // monitor lock
        // monitor
        // lock
        Object o = new Object(); // 바통의 역할 (이 객체를 잡는 Thread만이 실행 가능)

        Thread a = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                synchronized (o){
                field++;
                }
            }
        });
        Thread b = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                synchronized (o){
                    field++;
                }
            }
        });
        a.start();
        b.start();

        try {
            a.join();
            b.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(field);
    }
}
