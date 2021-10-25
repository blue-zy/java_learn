package main.java.Generic;


import jdk.nashorn.internal.ir.BaseNode;

// 泛型接口的实现
public class Test03 {
    public static void main(String[] args) {
        Generator banana = new Banana();
        System.out.println(banana.getKey());

        Apple<String, Integer> apple = new Apple<>("apple", 1);
        System.out.println(apple.getKey());

    }
}


interface Generator<T>{
    T getKey();
}


//1.实现类也是泛型类 和接口的泛型标识要一致
//不指定为Object
class Apple<T,E> implements Generator<T> {

    private T key;
    private E value;

    @Override
    public T getKey() {
        return key;
    }

    public E getValue() {
        return value;
    }

    public Apple(T key, E value) {
        this.key = key;
        this.value = value;
    }
}

//2.实现类不是泛型类 要指定类型
//不指定为Object
class Banana implements Generator<String> {

    @Override
    public String getKey() {
        return "Banana";
    }
}