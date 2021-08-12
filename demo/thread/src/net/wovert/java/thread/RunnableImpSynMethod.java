package net.wovert.java.thread;

public class RunnableImpSynMethod implements Runnable {
    private int ticket = 100; // 共享的票数
    private static int ticketStatic = 100; // 共享的票数

    Object obj = new Object(); // 创建一个锁对象

    // 同步方法
//    public synchronized void payTicket() {
//        if (ticket > 0 ){
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
//            ticket--;
//        }
//    }

    public void payTicket() {
        synchronized(this) {
            if (ticket > 0 ){
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }

    // 静态的同步方法
//    public synchronized void payTicketStatic() {
//        if (ticketStatic > 0 ){
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticketStatic + "张票");
//            ticketStatic--;
//        }
//    }

    public void payTicketStatic() {
        synchronized (Runnable.class) {
            if (ticketStatic > 0 ){
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticketStatic + "张票");
                ticketStatic--;
            }
        }
    }

    @Override
    public void run() {
        while(true) {
//            payTicket();
            payTicketStatic();
        }
    }
}
