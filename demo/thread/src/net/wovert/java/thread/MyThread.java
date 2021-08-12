package net.wovert.java.thread;

public class MyThread extends Thread {
    public MyThread() {}

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
//        String name = getName();
//        System.out.println("线程名称:" + name);

        System.out.println("当前线程名称：" + Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {
            System.out.println("run: " + i);
        }
    }
}
