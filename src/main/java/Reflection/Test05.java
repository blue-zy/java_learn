package main.java.Reflection;

public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }
}

class A {
    static {
        System.out.println("A's static place");
        m = 300; //m最开始并不是300 是0 设置默认初始值
    }
    static int m = 100;

    public A() {
        System.out.println("A's constructor");
    }
}
