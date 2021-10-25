package main.java.Generic;

import java.util.ArrayList;

//泛型方法的使用
public class Test04 {
    public static void main(String[] args) {
//        myGeneric2<Integer> myGeneric2 = new myGeneric2<>();
//        ArrayList<String> stringList = new ArrayList<>();
//        stringList.add("apple");
//        System.out.println(myGeneric2.test01(stringList));
//
//
//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        System.out.println(myGeneric2.test01(intList));
//
//        // 成员方法
//        System.out.println(myGeneric2.test01(100));
//

        //泛型类静态方法
//        myGeneric2.printType("100",100,true);
        //泛型类可变参数方法
        myGeneric2.print(1,2,3,4,5);
    }
}


class myGeneric2<E> {
    //泛型方法 <E>为泛型标识 具体类型是调用时决定
    public <E> E test01(ArrayList<E> list) {
        return list.get(0);
    }

    public E test01(E a) {
        return a;
    }

    public static <T, E, L> void printType(T t, E e, L l) {
        System.out.println(t.getClass());
        System.out.println(e.getClass());
        System.out.println(l.getClass());
    }

    //可变参数方法
    public static <E> void print(E...e) {
        System.out.println(e.getClass());
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

}