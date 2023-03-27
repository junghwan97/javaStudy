package ch12.lecture.p05reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C02Reflection {
    public static void main(String[] args) {
        Class class1 = String.class;

        // 이름 (full name)
        System.out.println(class1.getName());

        // 이름 (simple)
        System.out.println(class1.getSimpleName());

        // 패키지
        System.out.println(class1.getPackage());

        // 생성자
        Constructor[] constructors = class1.getConstructors();

        // 필드
        Field[] fields = class1.getFields();

        // 메서드
        Method[] methods = class1.getMethods();
    }
}
