package net.wovert.java.thread;

public class Bank {
    private String account;
    private int balance;

    public Bank(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "账号='" + account + '\'' +
                ", 余额=" + balance +
                '}';
    }

    /**
     * 存款
     */
    public synchronized void saveAccount() {
        int balance = getBalance();
        // 获取当前账号余额
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 修改余额，存100元
        balance += 100;
        setBalance(balance);
        System.out.println("存款后的账号余额为：" + balance);
    }

    /**
     * 提现: synchronized同步代码（线程执行时，不允许打断执行代码）
     */
    public void drawAccount() {
//    public synchronized void drawAccount() {
        synchronized(this) {
            int balance = getBalance();
            balance = balance - 200;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBalance(balance);
            System.out.println("取款后的账号余额：" + balance);
        }
    }
}
