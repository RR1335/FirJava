package thread.baijing.base;

public class ThreadTwoRun {
    public static void main(String[] args) {

        /*
        多线程第二种方法
            1. 自定义一个 Runnable 接口；
            2. 重写 run 方法；
            3. main 入口，创建 自定义class的对象
            4. 再创建 Thread 类对象，并开启线程
         */

        // Define 多线程要执行的 任务
        ThreadDefTwoClass tt = new ThreadDefTwoClass();

        // 创建线程对象，用 Thread 类；并启动线程
        Thread ttGo = new Thread(tt);
        ttGo.setName("tt - ");
        ttGo.start();

        ThreadDefTwoClass tc = new ThreadDefTwoClass();
        new Thread(tc).start();

    }
}
