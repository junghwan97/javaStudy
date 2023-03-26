package ch14.lecture.p03join;

public class C01Join {
    public static void main(String[] args) {
        System.out.println("main thread start");
        Thread t = new Thread(()-> {
            System.out.println("thread start");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread end");
        });
        t.start();
        try {
            t.join(); // t 쓰레드가 끝나길 기다린 후 진행
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread end");
    }
}
