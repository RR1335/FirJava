package multithreading.baijing.base;

public class ChannelClass {
    /*
     *  控制生产者(Producer) 和 消费者(Consumer) 的执行
     */

    // 0 : 无 ； 1 ： 有 。
    public static int channel = 0;

    public static int count = 10;

    public static Object lock = new Object();

}
