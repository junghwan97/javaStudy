package ch14.sec3.exam02;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Toolkit toolKit = Toolkit.getDefaultToolkit();
//                for (int i = 0; i < 5; i++) {
//                    toolKit.beep();
//                try {
//                    Thread.sleep(500);
//                } catch (Exception e) {
//                }
//                }
//            }
//        });
        Thread thread = new Thread(()-> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++){
                toolkit.beep();
                try {
                    Thread.sleep(500);
                }catch (Exception e){}
            }
        });

        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        }
    }
}
