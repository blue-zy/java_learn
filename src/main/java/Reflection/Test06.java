package main.java.Reflection;

// 测试类什么时候会初始化
public class Test06 {
    static {
        System.out.println("Test06 class load");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 1.主动引用
//        Son son = new Son();

        // 2.反射
//        Class.forName("main.java.Reflection.Son");

        // 不会初始化 1. 访问一个类的静态域 只有真正声明这个域的类才会被初始化
//        System.out.println(Son.b);

        // 不会初始化 2. 通过数组定义类引用 不会触发此类初始化
//        Son[] arr = new Son[5];

        // 不会初始化 3. 常量池在链接时就被赋值了 常量池中
        System.out.println(Son.M);

    }
}

class Father {

    static int b = 2;
    static{
        System.out.println("Father class load");
    }
}

class Son extends Father {

    static {
        System.out.println("Son class load");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;

}
