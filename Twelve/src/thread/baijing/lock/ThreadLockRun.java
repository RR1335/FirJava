package thread.baijing.lock;

public class ThreadLockRun {
    public static void main(String[] args) {

        LockThreadClass lc1 = new LockThreadClass();
        LockThreadClass lc2 = new LockThreadClass();
        LockThreadClass lc3 = new LockThreadClass();

        lc1.setName("Lock 1");
        lc2.setName("Lock 2");
        lc3.setName("Lock 3");

        lc1.start();
        lc2.start();
        lc3.start();

    }
}
