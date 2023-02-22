package ch04.exercise;

public class Example_Break {
    public static void main(String[] args) {
        outerLoop: // label을 통해 중첩된 반복문을 한꺼번에 벗어날 수 있다.
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                    System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    System.out.println("프로그램 종료");
                    break outerLoop;
                }
            }
        }
    }
}
