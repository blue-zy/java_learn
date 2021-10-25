package main.java.Thread;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 消费者生产者模型
public class test04 {

    public static void main(String[] args) {
        Storage storage = new Storage();
        new Thread(new Productor(storage)).start();
        new Thread(new Consumer(storage)).start();
    }
}

class Storage{

    private Queue<Integer> items = new LinkedList<>();
    int size = 2;
    int count = 0;

    public synchronized int push(){
        if (items.size() == size) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        items.offer(count++);
        this.notifyAll();
        return count - 1;
    }

    public synchronized int pop() {
        if (items.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.notifyAll();

        return items.poll();

    }

}

class Productor implements Runnable{
    private Storage storage;

    public Productor(Storage storage) {
        this.storage = storage;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("生产者生产了第"+storage.push()+"个产品");

        }
    }
}


class Consumer implements Runnable{
    private Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("消费者拿到第"+storage.pop()+"个产品！");

        }
    }
}