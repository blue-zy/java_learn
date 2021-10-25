package main.java.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.FileHandler;

// 获得类的信息
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class cl = Class.forName("main.java.Reflection.User");

        //获得类的信息
        System.out.println(cl.getName()); //获得包名+类名
        System.out.println(cl.getSimpleName()); //获得类名

        //获得类的属性
        Field[] fields = cl.getFields(); //只能找到public属性
        fields = cl.getDeclaredFields(); //找到全部属性
        for (Field field:fields) {
            System.out.println(field);
        }

        //获得指定属性的值
        Field name = cl.getDeclaredField("name");
        System.out.println(name);

        //获得方法
        Method[] methods = cl.getMethods(); //获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的：" + method);
        }

        methods = cl.getDeclaredMethods(); //获得本类的所有方法
        for (Method method : methods) {
            System.out.println("全部的："+method);
        }

        //获得指定方法
        //需要参数类型 因为存在重载
        Method getName = cl.getMethod("getName", null);
        Method setName = cl.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        //获得构造器
        System.out.println("-----------------------------------");
        Constructor[] constructors = cl.getConstructors(); //获得public的构造器
        Constructor[] declaredConstructors = cl.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        for (Constructor constructor : declaredConstructors) { //获得全部的构造器
            System.out.println(constructor);
        }

        //获得指定的构造器
        Constructor declaredConstructor1 = cl.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor1);
    }
}
