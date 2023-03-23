package ch14.lecture.p01thread;

public class C07Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("### thread work ####");
                }
            }
        };
        t1.start();

        while (true) {
            System.out.println("@@@@@ main thread @@@@@@@");
        }
    }
}
