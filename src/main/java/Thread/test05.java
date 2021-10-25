package main.java.Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// 线程池
public class test05 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" is main thread.");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,1,
                TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(1),
                new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 20; i++) {
            MyRunnable05 runnable = new MyRunnable05();
            executor.execute(runnable);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("done!");
    }
}


class MyRunnable05 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " doing work.");

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}