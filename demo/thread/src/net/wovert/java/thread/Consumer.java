package net.wovert.java.thread;

public class Consumer implements Runnable {
    Queue queue;

    Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while(true) {
            queue.getCount();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
