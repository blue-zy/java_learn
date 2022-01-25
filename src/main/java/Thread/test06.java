package main.java.Thread;

import main.tree.TreeNode;

public class test06 {
    public static void main(String[] args) {
        Object resource1 = new Object();
        Object resource2 = new Object();
        Thread thread1 = new Thread(new test1(resource1, resource2));
        Thread thread2 = new Thread(new test2(resource1, resource2));
        thread1.start();
//        thread2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.interrupt();
        System.out.println("thread1 interrupt");
    }
}

class test1 implements Runnable {
    private Object resource1;
    private Object resource2;

    public test1(Object resource1, Object resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        while (true) {
//
//            synchronized (resource1) {
//                System.out.println(Thread.currentThread().getName() + " get resource1.");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + " try to get resource2.");
//                synchronized (resource2) {
//                    System.out.println(Thread.currentThread().getName() + " get resource2.");
//                }
//            }
            boolean interrupted = Thread.currentThread().isInterrupted();
            if (interrupted){
                break;
            }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().isInterrupted());
            System.out.println(Thread.currentThread().getName()+" is running");
        }
        System.out.println(Thread.currentThread().getName()+" is over.");
    }
}

class test2 implements Runnable {
    private Object resource1;
    private Object resource2;

    public test2(Object resource1, Object resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource2) {
            System.out.println(Thread.currentThread().getName() + " get resource2.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " try to get resource1.");
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " get resource1.");
            }

        }
    }
}
