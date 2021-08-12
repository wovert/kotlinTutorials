package net.wovert.java.thread;

public class DemoInnerClass {
    public static void main(String[] args) {
        new Thread() {
          @Override
          public void run() {
              for (int i = 0; i < 20; i++) {
                  System.out.println(Thread.currentThread().getName() + ":" + i);
              }
          }
        }.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        };
        new Thread(r).start();

        // 简化接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();
    }
}
