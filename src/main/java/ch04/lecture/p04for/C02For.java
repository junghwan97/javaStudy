package ch04.lecture.p04for;

public class C02For {
    public static void main(String[] args) {
        // 변수 scope

        int i = 0;
        while (i < 3){
            System.out.println("while loop");
            i++;
        }

        for (int j = 0; j < 3; j++){
            System.out.println("for loop");
        }

        System.out.println(i);
        //System.out.println(j); // 유효범위가 for문 안에만 해당
    }
}
