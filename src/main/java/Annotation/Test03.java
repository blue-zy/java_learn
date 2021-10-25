package main.java.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test03 {

    @MyAnnotation2()
    public void test(){}
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    // 参数 参数类型+参数名(); 并不是方法
    String name() default "";

    int age() default 0;

    int id() default -1; //代表不存在 就比如indexof如果找不到就返回-1

    String[] schools() default {""};
}
