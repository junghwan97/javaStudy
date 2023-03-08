package ch08.lecture.p01interface;

// 인터페이스 구현 클래스
// 클래스명 implements 인터페이스명
// 인터페이스를 여러 개 구현할 수 있음
public class MyClass01 implements MyInterface01, MyInterface02{
    MyClass01 o1 = new MyClass01();
    MyInterface01 o2 = o1;
    MyInterface02 o3 = o1;

//    MyClass01 o4 = o2;
//    MyClass01 o5 = o3;
}
