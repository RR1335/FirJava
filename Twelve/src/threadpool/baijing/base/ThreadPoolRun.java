package threadpool.baijing.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolRun {
    public static void main(String[] args) {

//        ExecutorService pool = Executors.newCachedThreadPool();

        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.submit(new ThreadRunnableClass());
        pool.submit(new ThreadRunnableClass());
        pool.submit(new ThreadRunnableClass());
        pool.submit(new ThreadRunnableClass());
        pool.submit(new ThreadRunnableClass());
        pool.submit(new ThreadRunnableClass());

        pool.shutdown();

    }
}
