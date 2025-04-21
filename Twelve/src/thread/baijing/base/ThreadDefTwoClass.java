package thread.baijing.base;

public class ThreadDefTwoClass implements Runnable{

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(th.getName() + "Hello world");
        }
    }

}
