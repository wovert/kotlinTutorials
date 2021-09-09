package net.wovert.java.thread;

public class DemoQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        new Thread(new Producer(q)).start();
        new Thread(new Consumer(q)).start();
    }
}
