package thread.baijing.daemon;

public class DaemonOneClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " # " + i);
        }
    }

}
