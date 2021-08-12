package net.wovert.java.thread;

/**
 * 创建多线程程序的第2种方式：实现 Runnable 接口
 * java.lang.Runnable
 *
 * 实现步骤：
 * 1. 创建一个Runnable接口的实现类
 * 2. 实现类中重写 Runnable接口的 run 方法，设置线程任务
 * 3. 创建一个 Runnable 接口的实现类对象
 * 4. 创建 Thread 类对象，构造方法中传递 Runnable 接口的实现类对象
 * 5. 调用 Thread 类中的 start 方法，开启新的线程执行 run 方法
 */
public class DemoThread2 {
    public static void main(String[] args) {
        RunnableImp r = new RunnableImp();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

