package net.wovert.java.thread;

public class Queue {
    private int count;
    boolean flag = false;

    public synchronized int getCount() {
        if (!flag) {
            try {
                wait(); // 没有消费数据时等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费：" + count);
        flag = false; // 消费完毕，容器中已经没有数据
        notifyAll(); // 唤醒所有线程
        return count;
    }

    public synchronized void setCount(int count) {
        if (flag) {
            try {
                wait(); // 有生产数据时等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产：" + count);
        this.count = count;
        notifyAll(); // 唤醒所有线程
        flag = true; // 生产完毕，容器中已经有数据
    }
}
