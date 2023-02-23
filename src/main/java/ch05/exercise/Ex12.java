package ch05.exercise;

public class Ex12 { // 151p
    public static void main(String[] args) {
        int[] Array = null;
        Array[0] = 10; // NullPointerException

        String str = null;
        System.out.println("총 문자 수: " + str.length()); // NullPointerException
    }
}
