package thread.baijing.methods;

public class MainThreadRun {
    public static void main(String[] args) {

        Thread c = new Thread();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
    }
}
