package main.java.Thread;

// 继承Thread实现多线程
public class test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }


}


// 继承Thread类
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" MyThread i = " + i);

        }
        System.out.println(Thread.currentThread().getThreadGroup().getName());
    }
}




