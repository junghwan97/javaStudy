package ch11.lecture.p01exception;

public class C05RuntimeException {
    public static void main(String[] args) {
        //ClassCastException
        Object s = "java";
        Integer i = (Integer) s; // 다운 캐스팅 but String->Integer이므로 오류

        System.out.println("continue...");
    }
}
