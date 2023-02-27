package ch06.lecture.p03mathod;

public class C06Parameter {
    public static void main(String[] args) {
        // 자동 형변환
        int a = 3;
        long b = a;
        double c = b;


        MyClass06 o1 = new MyClass06();
        o1.method1(33);
        o1.method1('c');

        o1.method2(23057984237509273l);

    }
}
