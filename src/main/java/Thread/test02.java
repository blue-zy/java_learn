package main.java.Thread;

// 实现Runnable接口实现多线程
public class test02 {

    public static void main(String[] args) {
//        // 输出结果会错误，不符合常理，多线程在操作同一资源情况下 线程不安全
//        new Thread(new MyRunnable2(),"alice").start();
//        new Thread(new MyRunnable2(),"bob").start();
//        new Thread(new MyRunnable2(),"carol").start();
        new Thread(new MyRunnable()).start();
    }
}


// 实现Runnable接口
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" MyRunnable i = " + i);
        }
        System.out.println(Thread.currentThread().getThreadGroup().getName());
    }
}

// 实现Runnable接口模拟抢票
class MyRunnable2 implements Runnable {

    private int ticketNum = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                break;
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+" get ticket "+ticketNum--);
        }
    }
}