package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.Super01;

public class Sub01 extends Super01 {
    public void subMethod(){
        method1();
    }
    public void method3(){
        Super01 o1 = new Super01();
//        o1.method1(); 다른 패키지여서 안 됨
    }
}
