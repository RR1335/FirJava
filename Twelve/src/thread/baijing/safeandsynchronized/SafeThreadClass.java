package thread.baijing.safeandsynchronized;

public class SafeThreadClass extends Thread {

    // 所有的对象，共享 ticket 数据
    static int ticket = 0;

    // synchronized 要唯一，任意类型对象都可
    static Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            // 同步代码块
//        synchronized (lock){
        synchronized (SafeThreadClass.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + " 正在售卖第: " + ticket + " 张票。");
                } else {
                    break;
                }
            }
        }

    }
}
