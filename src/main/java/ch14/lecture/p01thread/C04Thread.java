package ch14.lecture.p01thread;

public class C04Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> { // Runnable 인터페이스를 람다식으로 구현
            while (true){
                System.out.println("### Thread start ###");
            }
        });
        t1.start();

        while (true){
            System.out.println("@@@ main thread start @@@");
        }
    }
}
