package net.wovert.java.thread;

public class RunnableImpSynchronized implements Runnable {
    private int ticket = 100; // 共享的票数

    Object obj = new Object(); // 创建一个锁对象

    @Override
    public void run() {
        while(true) {
            // 同步代码块
            synchronized (obj) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (ticket > 0 ){
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
