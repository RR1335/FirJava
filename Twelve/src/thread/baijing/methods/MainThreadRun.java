package thread.baijing.methods;

public class MainThreadRun {
    public static void main(String[] args) {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
    }
}
