package main.java.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.FileHandler;

//动态创建对象 反射
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("main.java.Reflection.User");

        //构造一个对象
        //User user = (User) c1.newInstance(); //本质上调用了类的无参构造器
        //System.out.println(user);

        //通过构造器创建对象
        //Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        //User user2 = (User) declaredConstructor.newInstance("name", 001, 18);
        //System.out.println(user2);

        //通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        System.out.println(user3);
        //通过反射获取的方法对象调用invoke(对象,“方法的值”)可以操作一个方法
        setName.invoke(user3, "name3");
        System.out.println(user3);

        //通过的反射操作属性
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");

        //不能直接操作私有属性 需要关闭程序的安全检测 setAccessible(true) 方法和属性 构造器对象都能调用
        name.setAccessible(true); //关闭访问检查 无论方法还是属性
        name.set(user4, "name4");
        System.out.println(user4.getName());
    }
}
