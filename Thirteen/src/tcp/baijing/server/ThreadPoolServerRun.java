package tcp.baijing.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolServerRun {
    public static void main(String[] args) throws IOException {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,                            // 核心线程池数量
                12,                                       // 线程池MAX
                60,                                       // 空闲时间
                TimeUnit.SECONDS,                         // 单位 ， 时间
                new ArrayBlockingQueue<>(2),      // 队列
                Executors.defaultThreadFactory(),         // 线程工厂，线程池创建线程对象的方式
                new ThreadPoolExecutor.AbortPolicy()      // 阻塞队列
        );

        ServerSocket ss = new ServerSocket(20002);

        while (true) {
            Socket socket = ss.accept();

//            new Thread(new ServerThreadClass(socket)).start();
/*
无需，通过 thread 创建线程；通过 pool 创建的线程池直接调用线程的 run 方法即可。
 */
            pool.submit(new ServerThreadClass(socket));

        }

    }
}
