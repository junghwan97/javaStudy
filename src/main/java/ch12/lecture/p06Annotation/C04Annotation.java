package ch12.lecture.p06Annotation;

import java.lang.annotation.*;

@MyAnnotation04
public class C04Annotation {
    public static void main(String[] args) {
        Class c1 = MyClass04.class;
        Annotation[] annotations = c1.getAnnotations();
        System.out.println(annotations.length);
        System.out.println(annotations[0]);

        System.out.println(c1.getDeclaredFields()[0].getAnnotations()[0]);
        System.out.println(c1.getDeclaredConstructors()[0].getAnnotations()[0]);
    }
}
@MyAnnotation04
class MyClass04{
    @MyAnnotation04
    String field;

    @MyAnnotation04
    public MyClass04(String field) {
        this.field = field;
    }
}

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation04{

}
