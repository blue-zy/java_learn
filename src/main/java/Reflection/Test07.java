package main.java.Reflection;

import java.awt.*;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取系统类加载器的父类加载-》扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        // 获取扩展类加载器的父类加载器-》根加载器(C/C++) 无法直接获取 所以得出null
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        // 测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("main.java.Reflection.Test07").getClassLoader();
        System.out.println(classLoader);

        // 测试jdk内置的类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        // 如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

        // 双亲委派机制
            // 如果跟高级的类加载器中有相同的类 会优先采用更高级类加载器的包 比如自己写个String类会没有用(系统类加载器)

    }
}
