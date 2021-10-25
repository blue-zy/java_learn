package main.java.InnerClass;

//局部内部类
public class Outer2 {

    private int num = 10;

    public void method() {
        class Inner {
            public void show() {
                System.out.println(num);
            }
        }

        Inner i = new Inner();
        i.show();
    }

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.method();
    }
}
