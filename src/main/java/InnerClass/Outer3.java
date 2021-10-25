package main.java.InnerClass;

//匿名内部类也是局部内部类的一种特殊形式
//本质上是一个继承了父类或者实现了接口的匿名对象
public class Outer3 {

    public void method() {
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        Inter inter = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        inter.show();
    }

    public static void main(String[] args) {
        new Outer3().method();
    }
}

interface Inter {
    void show();
}
