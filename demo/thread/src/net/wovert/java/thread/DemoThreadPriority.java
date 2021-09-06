package net.wovert.java.thread;

/**
 * 线程的生命周期
 * 新建(New)
 * 可运行(Runnable)
 * 正在运行(Running)
 * 阻塞(Blocked)
 * 终止(Dead)
 */
public class DemoThreadPriority {
    public static void main(String[] args) {
        priority();
    }

    /**
     * Thread 类的方法：join() 等待调用该方法的线程结束后才能执行
     */
    private static void priority() {
        // 获取主线程优先级
        int mainPriority = Thread.currentThread().getPriority();
        System.out.println("[主线程]的优先级是" + mainPriority);
        MyThread3 mt = new MyThread3("子线程1");
        MyThread3 mt1 = new MyThread3("子线程2");
//        mt.setPriority(10);
        mt.setPriority(Thread.MAX_PRIORITY);
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt.start();
        mt1.start();
        System.out.println("[子线程1]的优先级为" + mt.getPriority());
        System.out.println("[子线程2]的优先级为" + mt1.getPriority());
    }
}

class MyThread3 extends Thread {
    private String name;

    public MyThread3(String name) {
        this.name = name;
    }
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println("线程" + name + "正在执行" + i);
        }
    }
}
