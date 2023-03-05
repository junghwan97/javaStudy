//package ch06.exercise.exam20;
//
//import java.util.Scanner;
//
//public class BankApplication {
//    private static Scanner sc = new Scanner(System.in);
//    private static Account[] accounts = new Account[100];
//
//    public static void main(String[] args) {
//
//        boolean run = true;
//
//        while (run) {
//            System.out.println("===================================================");
//            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
//            System.out.println("===================================================");
//            System.out.print("선택> ");
//            int n = sc.nextInt();
//            switch (n) {
//                case 1:
//                    createAccount();
//                    break;
//                case 2:
//                    showAccountList();
//                    break;
//                case 3:
//                    deposit();
//                    break;
//                case 4:
//                    withdraw();
//                    break;
////                case 5:
////                    shutDown();
////                    break;
//            }
//        }
//
//    }
//
//    private static void withdraw() {
//        System.out.println("-------");
//        System.out.println(" 출금");
//        System.out.println("-------");
//        System.out.print("계좌번호: ");
//        String addressNum = sc.next();
//        System.out.print("출금액: ");
//        int accountBal = sc.nextInt();
//        Account account = findAccount(addressNum);
//        if (account == null) {
//            System.out.println("계좌가 확인되지 않습니다.");
//            return;
//        }
//        if (!account.getAddressNum().equals(addressNum)) {
//            System.out.println("계좌번호를 다시 확인해주세요!");
//            return;
//        }
//        if (account.getBalance() < accountBal){
//            System.out.println("잔액이 부족합니다.");
//            return;
//        }
//
//        System.out.println("출금이 성공되었습니다.");
//    }
//
//    private static void deposit() {
//        System.out.println("-------");
//        System.out.println(" 예금");
//        System.out.println("-------");
//        System.out.print("계좌번호: ");
//        String addressNum = sc.next();
//        System.out.print("예금액: ");
//        int accountBal = sc.nextInt();
//        Account account = findAccount(addressNum);
//        if (account == null) {
//            System.out.println("계좌가 확인되지 않습니다.");
//            return;
//        }
//        if (!account.getAddressNum().equals(addressNum)) {
//            System.out.println("계좌번호를 다시 확인해주세요!");
//            return;
//        }
//
//    }
//
//    private static Account findAccount(int balacne) {
//
//    }
//
//    private static void showAccountList() {
//        System.out.println("-------");
//        System.out.println("계좌목록");
//        System.out.println("-------");
//        for (int i = 0; i < accounts.length; i++) {
//            //===================================
//            if (accounts[i] != null) {
//                System.out.println(accounts[i].getAddressNum() + "  " + accounts[i].getAddressPerson() + "  " + accounts[i].getBalance());
//            }
//        }
//
//    }
//
//    private static void createAccount() {
//        System.out.println("-------");
//        System.out.println("계좌생성");
//        System.out.println("-------");
//        System.out.print("계좌번호: ");
//        String addressNum = sc.next();
//        System.out.print("계좌주: ");
//        String addressPerson = sc.next();
//        System.out.print("초기입금액: ");
//        int balance = sc.nextInt();
//
//        Account newAccount = new Account(addressNum, addressPerson, balance);
//        for (int i = 0; i < accounts.length; i++) {
//            if (accounts[i] == null) {
//                accounts[i] = newAccount;
//                break;
//            }
//        }
//        System.out.println("결과: 계좌가 생성되었습니다.");
//
//    }
//
//
//}
