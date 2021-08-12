package net.wovert.java.thread;

public class RunnableImp1 implements Runnable {
    private int ticket = 100; // 共享的票数

    @Override
    public void run() {
        while(true) {
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
