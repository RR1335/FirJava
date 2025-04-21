package thread.baijing.daemon;

public class ThreadDaemonRun {
    public static void main(String[] args) {

        DaemonOneClass d1 = new DaemonOneClass();
        DaemonTwoClass d2 = new DaemonTwoClass();

        d1.setName("One 天女散花");
        d2.setName("Two 帅锅锅");

        d1.setDaemon(true);

        d1.start();
        d2.start();

    }
}
