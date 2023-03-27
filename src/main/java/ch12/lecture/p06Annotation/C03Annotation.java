package ch12.lecture.p06Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class C03Annotation {

}

@MyAnnotation03
class MyClass03{

    @MyAnnotation03
    String field;

    @MyAnnotation03
    MyClass03(){}

    @MyAnnotation03
    void method3(){}
}

//@Target(ElementType.FIELD) // 어노테이션 제한
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03{

}