package threadpool.baijing.base;

public class ThreadRunnableClass implements Runnable {

    @Override
    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " is running " + i);
//        }
//
        System.out.println(Thread.currentThread().getName() + " is running ");
    }
}
