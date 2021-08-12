package net.wovert.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThreadPool {
    public static void main(String[] args) {
        // 创建指定数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        // 线程池一直开启，使用完了线程，会自动把线程归还给线程池，线程可以继续使用
        es.submit(new RunnableImpPool());
        es.submit(new RunnableImpPool());
        es.submit(new RunnableImpPool());

        // 销毁线程池
        es.shutdown();

        es.submit(new RunnableImpPool()); // 抛异常，线程池都没有了，不能使用了
    }
}
