package main.java.Generic;

//泛型类派生子类
public class Test02 {
    public static void main(String[] args) {
        Child1<String,Integer> child1 = new Child1<>();

    }
}

class Parent<E> {
    private E value;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}


//1.子类也是泛型类 则传入父类泛型标识要一致
//不指定为Object
class Child1<T,E> extends Parent<T> {
    @Override
    public T getValue() {
        return super.getValue();
    }
}

//2.子类不是泛型类 父类要指定具体类型
//不指定为Object
class Child2 extends Parent<String> {
    @Override
    public String getValue() {
        return super.getValue();
    }
}