package main.java.Generic;

// 泛型类使用
public class Test {
    public static void main(String[] args) {
        myGeneric<Integer> a1 = new myGeneric<>(100);
        myGeneric a2 = new myGeneric("100");
        System.out.println(a1.getKey());
        System.out.println(a2.getKey());
    }
}

// T在创建对象时指定具体的数据类型
// 是由外部使用类的时候来指定的
class myGeneric<T> {
    private T key;

    public myGeneric(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "myGeneric{" +
                "key=" + key +
                '}';
    }
}