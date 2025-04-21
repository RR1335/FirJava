package thread.baijing.base;

import java.util.concurrent.Callable;

public class CallableClass implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        // Thread 有返回值， Callable 是带泛型的
        return sum;
    }

}
