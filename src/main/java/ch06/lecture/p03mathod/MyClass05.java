package ch06.lecture.p03mathod;

public class MyClass05 {

    void method1(){
        // 실행코드
        System.out.println("파라미터 없는 메서드");
    }

    void method2(int x, int y){
        System.out.println(x + "+" + y + "=" + (x+y));
    }
    void mehtod3(int line){
        for (int i = 0; i < line; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
