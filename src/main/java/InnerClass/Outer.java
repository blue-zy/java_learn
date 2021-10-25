package main.java.InnerClass;

//成员内部类
public class Outer {

    private int num = 10;

    public class Inner {
        private int num = 20;
        public void show() {
            //内部类可以直接访问外部类数据
            Outer outer = new Outer();
            System.out.println(outer.num);
            System.out.println(num);

        }
    }

    //一般来说就是要把内部类隐藏 在外部类中写个方法来调用
    public void show() {
        //外部类访问内部类成员必须new一个对象
        Inner inner = new Inner();
        inner.show();
    }

    public static void main(String[] args) {
        //注意格式 外部类.内部类 对象名 = 外部类对象.内部类对象
        //一般不提供给其他类
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
