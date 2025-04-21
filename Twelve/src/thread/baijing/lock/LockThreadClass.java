package thread.baijing.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockThreadClass extends Thread {

    static int ticket;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();

            try {
                if (ticket < 100) {
                        Thread.sleep(100);
                    ticket++;
                    System.out.println("正在售卖 - " + ticket + "张票。" + "售票员 ： " + Thread.currentThread().getName());
                }else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }
    }



}
