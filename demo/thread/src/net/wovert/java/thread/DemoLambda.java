package net.wovert.java.thread;

public class DemoLambda {
    public static void main(String[] args) {
        // 使用匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "使用匿名内部类实现新线程创建");
            }
        }).start();

        // 使用lambda表达式，实现多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "lambda表达式实现新线程创建");
        }).start();
    }
}
