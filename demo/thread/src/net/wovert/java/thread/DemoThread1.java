package net.wovert.java.thread;

/**
 * 创建多线程程序的第一种方式：创建Thread类的子类
 * java.lang.Thread: 必须继承 Thread类
 *
 * 实现步骤：
 * 1. 创建Thread类的子类
 * 2. 在Thread 类的子类中重写 Thread类中的 run 方法，设置线程任务（开启程序要做什么？）
 * 3. 创建 Thread 类的子类对象
 * 4. 调用 Thread 类中的方法 start 方法，开启新的线程，执行 run 方法
 */
public class DemoThread1 {
    public static void main(String[] args) {
        // 创建Thread类的子类对象
        MyThread mt = new MyThread();
        // 调用Thread类中的方法start方法，开启新的线程，执行 run 方法
        mt.setName("第1个子线程");
        mt.start();

        System.out.println("当前线程名称：" + Thread.currentThread().getName());
        // 主线程执行程序
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main: " + i);
        }

        new MyThread("第2个子线程").start();
    }
}

