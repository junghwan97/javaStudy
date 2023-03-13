package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        action((x, y)-> {
            int result = x + y;
            System.out.println(result);
        });

        action((x, y)-> {
            int result = x - y;
            System.out.println(result);
        });
    }
    public static void action(Calcuable calculable){
        int x = 10;
        int y = 4;
        calculable.calculation(x, y);

    }
}
