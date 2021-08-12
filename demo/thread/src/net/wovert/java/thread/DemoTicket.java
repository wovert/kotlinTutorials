package net.wovert.java.thread;

public class DemoTicket {
    public static void main(String[] args) {

//        RunnableImp1 run = new RunnableImp1();
//        Thread tr1 = new Thread(run);
//        Thread tr2 = new Thread(run);
//        Thread tr3 = new Thread(run);
//        tr1.start();
//        tr2.start();
//        tr3.start();

//        RunnableImpSynchronized run = new RunnableImpSynchronized();
//        Thread tr1 = new Thread(run);
//        Thread tr2 = new Thread(run);
//        Thread tr3 = new Thread(run);
//        tr1.start();
//        tr2.start();
//        tr3.start();

//        RunnableImpSynMethod run = new RunnableImpSynMethod();
//        Thread tr1 = new Thread(run);
//        Thread tr2 = new Thread(run);
//        Thread tr3 = new Thread(run);
//        tr1.start();
//        tr2.start();
//        tr3.start();

        RunnableImpLock run = new RunnableImpLock();
        Thread tr1 = new Thread(run);
        Thread tr2 = new Thread(run);
        Thread tr3 = new Thread(run);
        tr1.start();
        tr2.start();
        tr3.start();
    }
}
