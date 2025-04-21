package thread.baijing.yield;

public class ThreadSoClass extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " : " + i);

            Thread.yield(); // 让执行结果略均匀
        }
    }


}
