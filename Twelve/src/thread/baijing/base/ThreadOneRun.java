package thread.baijing.base;

public class ThreadOneRun {
    public static void main(String[] args)  {

        /*
        第一种启动方式
            1. 定义一个类，继承 Thread
            2. 重写 run 方法
            3. 创建子类，启动线程
         */

        ThreadDefClass th = new ThreadDefClass();
        th.setName("TH - ");
        th.start();

        ThreadDefClass td = new ThreadDefClass();
        td.setName("TD - ");
        td.start();

    }


}
