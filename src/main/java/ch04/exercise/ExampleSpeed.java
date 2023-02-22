package ch04.exercise;

import java.util.Scanner;

public class ExampleSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while(run){
            System.out.println("====================");
            System.out.println("1. 증속 : 2. 감속 : 3. 멈춤");
            System.out.println("====================");
            System.out.println("속도를 선택해주세요!");
            String strNum = sc.nextLine();

            if (strNum.equals("1")){
                speed++;
                System.out.println("현재 속도 : " + speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재 속도 : " + speed);
            }else if(strNum.equals("3")){
                System.out.println("멈춥니다.");
                run = false;

            }


        }

    }
}
