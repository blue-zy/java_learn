package main.java.Generic;

import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test09 {
    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        ArrayList<String> strings = new ArrayList<>();
//
//        System.out.println(integers.getClass());
//        System.out.println(strings.getClass());
        //无限制的类型擦除 转换为Object
        Erasure<Integer> erasure = new Erasure<>();
        Class<? extends Erasure> c1 = erasure.getClass();
        Field[] declaredFields = c1.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            //输出是Object类
            System.out.println(declaredFields[i].getName() + ":" + declaredFields[i].getType());
        }

        //有限制类型擦除 设置了上限
        Erasure2<Integer> erasure2 = new Erasure2<>();
        Class<? extends Erasure2> c2 = erasure2.getClass();
        Field[] declaredFields2 = c2.getDeclaredFields();
        for (int i = 0; i < declaredFields2.length; i++) {
            //输出是Number类
            System.out.println(declaredFields2[i].getName() + ":" + declaredFields2[i].getType());
        }

        //擦除方法
        Erasure3 erasure3 = new Erasure3();
        Class<? extends Erasure3> c3 = erasure3.getClass();
        Method[] declaredMethods = c3.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            //输出是Number类
            System.out.println(declaredMethod.getName() + ":" + declaredMethod.getReturnType());
        }

        //桥接方法
        InfoImpl info = new InfoImpl();
        System.out.println(info.info(100));
        Class<? extends InfoImpl> c4 = info.getClass();
        Method[] declaredMethods1 = c4.getDeclaredMethods();
        for (Method method : declaredMethods1) {
            //会打印两个 一个为Object与接口连接 一个为Integer
            System.out.println(method.getName() + ":" + method.getReturnType());
        }
    }
}


class Erasure<T> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}

class Erasure2<T extends Number> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}

class Erasure3{
    public <T extends Number> T getValue(T value) {
        return value;
    }

}

interface Info<T> {
    T info(T t);
}

class InfoImpl implements Info<Integer> {

    @Override
    public Integer info(Integer integer) {
        return integer;
    }
}
