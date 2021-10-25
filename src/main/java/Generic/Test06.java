package main.java.Generic;

//测试泛型能不能传入子类
public class Test06 {
    public static void main(String[] args) {
        //报错
//        TestGeneric<Parent2> testGeneric = new TestGeneric<Child22>();
    }
}


class TestGeneric<T> {
}

class Parent2 {

}

class Child22 extends Parent2 {

}