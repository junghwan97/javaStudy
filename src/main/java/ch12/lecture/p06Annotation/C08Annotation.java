package ch12.lecture.p06Annotation;

public class C08Annotation {

}

class MyClass08 {
    @MyAnnotation08(100)
    int f1;

    @MyAnnotation08(value = 100)
    int f2;

    @MyAnnotation08(value/*여러가지 속성을 줄 때 value 생략 불가*/ = 100, name = "lee")
    int f3;
}

@interface MyAnnotation08 {
    int value() default 0;

    String name() default "Kim";

    int age() default 0;
}