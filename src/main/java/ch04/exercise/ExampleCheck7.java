package ch04.exercise;

import java.util.Scanner;

public class ExampleCheck7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int money = 0;
        int insert;
        int consum;
        while (run){
            System.out.println("=====================================");
            System.out.println("1. 예금 : 2. 출금 : 3. 잔고 : 4. 종료" );
            System.out.println("=====================================");
            System.out.print("선택> ");
            String strNum = sc.nextLine();

            if (strNum.equals("1")){
                System.out.print("예금액 : ");
                insert = Integer.parseInt(sc.nextLine());
                money += insert;
            }
            else if(strNum.equals("2")){
                System.out.print("출금액 : ");
                consum = Integer.parseInt(sc.nextLine());
                money -= consum;
            } else if (strNum.equals("3")) {
                System.out.println("잔고 : " + money);
            } else if (strNum.equals("4")) {
                System.out.println("프로그램 종료");
                run = false;
            }

        }
    }
}
