package net.wovert.java.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpLock implements Runnable {
    private int ticket = 100; // 共享的票数

    // 成员位置创建一个 ReentrantLock 对象
    Lock lock = new ReentrantLock();

    public void payTicket() {

    }
    @Override
    public void run() {
        while(true) {
            lock.lock();
            if (ticket > 0 ){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } catch (Exception e) {
                    e.printStackTrace();
                }  finally {
                    lock.unlock(); // 无论程序是否有异常，都会把锁释放
                }
            }
        }
    }
}
