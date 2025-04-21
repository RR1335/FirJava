package thread.baijing.base;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadThreeRun {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
        第三种实现方式
            1. 创建一个类，实现 Callable 接口
            2. 重写 call —— 有返回值，多线程的执行结果
            3. 创建 自定义类的对象
            4. 创建 FutureTask对象 —— 多线程执行的结果
            5. 创建 Thread 对象，并启动

         */

        CallableClass cc = new CallableClass();
        FutureTask<Integer> fc = new FutureTask<>(cc);

        new Thread(fc).start();


        // 获取结果
        System.out.println(fc.get());

    }
}
