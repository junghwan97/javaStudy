package beakJoon;

import java.util.Scanner;

public class B1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] a = line.split(" ");
        int count = 0;

        for (int i = 0; i < a.length; i++){
            if (!a[i].equals("")){
                count ++;
            }
        }

        System.out.println(count);
    }
}