package net.wovert.java.thread;

/**
 * 线程的生命周期
 * 新建(New)
 * 可运行(Runnable)
 * 正在运行(Running)
 * 阻塞(Blocked)
 * 终止(Dead)
 */
public class DemoThreadSleep {
    public static void main(String[] args) {

        MyThreadSleep mt = new MyThreadSleep();
        Thread t = new Thread(mt);
        t.start();
        Thread t2 = new Thread(mt);
        t2.start();
    }

}
class MyThreadSleep implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(Thread.currentThread().getName() + "执行第" + i + "次");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}