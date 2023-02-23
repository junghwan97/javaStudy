package beakJoon;
import java.util.Scanner;

public class B9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop;
        loop = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < loop; i++) {
            String str = sc.nextLine();
//            System.out.println(str.charAt(0) + str.charAt(str.length()-1));
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(str.length() - 1));

        }
    }
}
