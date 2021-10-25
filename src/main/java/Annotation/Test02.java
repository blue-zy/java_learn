package main.java.Annotation;

import java.lang.annotation.*;

@MyAnnotation
public class Test02 {
    @MyAnnotation
    public void test(){

    }
}


@Target(value = {ElementType.METHOD, ElementType.TYPE})
// target元注解表示注解可用于何处
@Retention(value = RetentionPolicy.RUNTIME)
// retention表示注解在什么地方有效
// RUNTIME>CLASS>SOURCE
@Documented
// documented表示是否将注解生成在javadoc中
@Inherited
// inherited表示子类可以继承父类的注解
@interface MyAnnotation{

}