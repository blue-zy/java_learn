package main.java.Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//泛型和数组
public class Test10 {
    public static void main(String[] args) {
        //可以声明带泛型的数组引用 但是不能直接创建泛型数组引用
        //如下报错
//        ArrayList<String>[] lists = new ArrayList<String>[5];

//        test01();
//        test02();
        Fruit<Integer> fruit = new Fruit(Integer.class, 1);
        fruit.put(0,100);
        System.out.println(fruit.get(0));

        System.out.println(Arrays.toString(fruit.getArray()));
    }

    public static void test01() {
        //如下可以 但不安全
        ArrayList[] lists1 = new ArrayList[5];
        ArrayList<String>[] lists2 = lists1;
        //会有运行时问题
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(100);
        lists1[0] = integers;
        //会报错 但是能通过编译
        String s = lists2[0].get(0);
        System.out.println(s);
    }

    public static void test02() {
        //最好不要暴露出来 如下 比较安全
        ArrayList<String>[] lists = new ArrayList[5];
//        lists[0] = integers;//这里就会报错 通不过编译
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaa");
        lists[0] = strings;
        String s1 = lists[0].get(0);
        System.out.println(s1);
    }
}

class Fruit<T> {
//    private T[] arrary = new T[3]; //报错
    private T[] array;

    public Fruit(Class<T> c, int length) {
        //通过Array.newInstance可以创建泛型数组
        array = (T[]) Array.newInstance(c,length);
    }

    public void put(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] getArray(){
        return array;
    }
}