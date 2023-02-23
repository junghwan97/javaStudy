package ch05.exercise;

public class Ex18 { //163p
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location); // 3
        String substing = subject.substring(location);
        System.out.println(substing); // 프로그래밍

        location = subject.indexOf("자바"); // 0
        if (location != -1){
            System.out.println("자바와 관련된 책이군요!");
        }
        else{
            System.out.println("자바와 관련 없는 책이군요!");
        }
        boolean result = subject.contains("자바"); // true
        if (result){
            System.out.println("자바와 관련된 책이군요!");
        }
        else {
            System.out.println("자바와 관련 없는 책이군요!");
        }
    }

}
