package ch12.lecture.p04system;

public class C02System {
    public static void main(String[] args) {
        long startNano = System.nanoTime();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_0000_0000; i++) {
            int r = 3 * i;
        }
        long end = System.currentTimeMillis();
        long endNano = System.nanoTime();
        System.out.println(end - start);
        System.out.println(endNano - startNano);
    }
}
