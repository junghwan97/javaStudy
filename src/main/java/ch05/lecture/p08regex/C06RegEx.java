package ch05.lecture.p08regex;

public class C06RegEx {
    public static void main(String[] args) {
        System.out.println("Az".matches("[A-Z][a-z]"));
        System.out.println("Bd".matches("[A-Z][a-z]"));
        System.out.println("Tv".matches("[A-Z][a-z]"));
        System.out.println();
        System.out.println("TV".matches("[A-Z][a-z]"));
        System.out.println("LA".matches("[A-Z][a-z]"));
    }
}
