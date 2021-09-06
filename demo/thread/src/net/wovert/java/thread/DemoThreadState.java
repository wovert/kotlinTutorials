package net.wovert.java.thread;

/**
 * 线程的生命周期
 * 新建(New)
 * 可运行(Runnable)
 * 正在运行(Running)
 * 阻塞(Blocked)
 * 终止(Dead)
 */
public class DemoThreadState {
    public static void main(String[] args) {
        joinMethd();
    }

    /**
     * Thread 类的方法：join() 等待调用该方法的线程结束后才能执行
     */
    private static void joinMethd() {
        MyThread2 mt = new MyThread2();
        mt.start();
        try {
            mt.join(1); // 等待该线程终止的最长时间为毫秒
        } catch( InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=1; i<=10; i++) {
            System.out.println("主线程运行" + i + "次");
        }
        System.out.println("主线程运行结束");
    }
}
class MyThread2 extends Thread {
    public void run() {
        for (int i=1; i<=300; i++) {
            System.out.println(getName() + "正在执行" + i + "次!");
        }
    }
}
