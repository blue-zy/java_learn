package main.designPattern.Singleton;

public class Singleton {
    public static void main(String[] args) {
    }
}

/**
 * 懒汉
 * 单线程
 * 线程不安全，多线程不能正常工作
 * lazy loading
 */
class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(String value){
    }

    public static Singleton1 getInstance(String value){
        if(instance == null){
            instance = new Singleton1(value);
        }
        return  instance;
    }
}

/**
 * 懒汉
 * 多线程
 * 具备好的lazy loading
 * 效率低
 * 因为创建了实例之后，其实是不用再用synchronized加锁了
 * 第七种双重校验改进了
 */
class Singleton2 {
    private static Singleton2 instance;

    private Singleton2 (String value){
    }

    public static synchronized Singleton2 getInstance(String value) {
        if(instance == null){
            instance = new Singleton2(value);
        }
        return instance;
    }
}

/**
 * 饿汉
 * 基于classloader避免了多线程同步问题
 * 没有达到lazy loading效果
 */
class Singleton3{
    private static Singleton3 instance = new Singleton3();

    private Singleton3 (){

    }
    public static Singleton3 getInstance(){
        return instance;
    }
}

/**
 * 饿汉
 * 类似于第三种
 * 类初始化时即实例化instance
 */
class Singleton4{
    private static Singleton4 instance = null;

    static {
        instance = new Singleton4();
    }

    private Singleton4(){

    }

    public static Singleton4 getInstance(){
        return instance;
    }
}

/**
 * 静态内部类
 * 同样利用classloader保证初始化时只有一个线程
 * 与3，4不同的是：第三第四种方法只要类被装载了，instance就会被实例化
 * 这种方式是类被装载了，instance不一定被实例化，因为Single5Holder没有被主动使用
 * 因此只有显示通过调用getInstance方法时，才会显示装载Single5Holder类，实例化。
 */
class Singleton5{
    private static class Singleton5Holder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5(){

    }

    public static final Singleton5 getInstance(){
        return Singleton5Holder.INSTANCE;
    }
}

/**
 * Effective Java作者Josh Bloch 提倡的方式
 * 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * 1.5中才加入enum特性，实际种很少用
 * 类Resource是我们要应用单例模式的资源，具体可以表现为网络连接，数据库连接，线程池等等
 * 用 Singleton.INSTANCE.getInstance() 即可获得所要实例
 */
enum Singleton6{
    INSTANCE;
    private Resource instance;

    Singleton6(){
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }

    public static class Resource {
        private Resource() {
            System.out.println("创建了Resource实例!");
        }
        public void whoAmI() {
            System.out.println(this.toString());
        }
    }

}

/**
 * 双重校验锁
 * 第二种的升级版
 * jdk1.5之后
 * 才能正常打到单例效果
 */
class Singleton7{
    private volatile static Singleton instance;

    private Singleton7() {

    }

    public static Singleton getSingleton() {
        if (instance == null) {
            synchronized (Singleton7.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
                return instance;
            }
        }
        return instance;
    }
}