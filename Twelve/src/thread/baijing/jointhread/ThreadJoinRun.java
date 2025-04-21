package thread.baijing.jointhread;

public class ThreadJoinRun {
    public static void main(String[] args) throws InterruptedException {

        JoinClass jc = new JoinClass();

        jc.setName("下雨天");

        jc.start();

        jc.join(); // 将 “下雨天” 线程，放到 “Main” 之前执行

        // -- main --
        for (int i = 0; i < 10; i++) {
            System.out.println("Main" + " : " + i);
        }

    }
}
