package beakJoon;

import java.util.Scanner;

public class B10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] list = new String[5][15];
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextLine().split("");
        }
        // 큰 길이 구하기
        for (int i = 0; i < list.length; i++){
            if (max < list[i].length){
                max = list[i].length;
            }
        }

        for (int i = 0; i < max; i++){
            for (int j = 0; j < list.length; j++){
             if (i < list[j].length){
                 System.out.print(list[j][i]);
             }
            }
        }
//
//            for (int j = 0; j < list[i].length; j++){
//                System.out.println(list[j]);
//            }
//        }
    }
}
