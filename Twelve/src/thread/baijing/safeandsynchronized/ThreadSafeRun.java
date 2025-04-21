package thread.baijing.safeandsynchronized;

public class ThreadSafeRun {
    public static void main(String[] args) {

        SafeThreadClass sc1 = new SafeThreadClass();
        SafeThreadClass sc2 = new SafeThreadClass();
        SafeThreadClass sc3 = new SafeThreadClass();

        // 三个人，分别在三个窗口卖票
        sc1.setName("如花似玉 ");
        sc2.setName("美男计 ");
        sc3.setName("下雨天很潮 ");

        sc1.start();
        sc2.start();
        sc3.start();

    }
}
