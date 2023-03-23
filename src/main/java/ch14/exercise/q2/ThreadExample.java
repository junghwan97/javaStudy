package ch14.exercise.q2;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();

        for (int i =0; i< 3; i++){
            System.out.println("main thread");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
