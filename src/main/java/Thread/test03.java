package main.java.Thread;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;

// 实现Callable接口实现多线程
public class test03 {
        public static void main(String[] args) throws ExecutionException, InterruptedException {
//                // 方法一 利用FutureTask包装器
//                FutureTask<Integer> ft = new FutureTask<>(new MyCallable());
//                Thread thread = new Thread(ft);
//                thread.start();
//                System.out.println(ft.get());

                // 方法二 利用执行器构建线程池, 记得关闭线程池
                ExecutorService service = Executors.newFixedThreadPool(1);
                Future<Integer> result = service.submit(new MyCallable());
                System.out.println(result.get());
                service.shutdownNow();
        }
}

class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
                return 123;
        }
}
