package in.baijing.interfaceabstract;

public interface Inter {

    public void InterMethod();

    // 给默认方法服务的
    private void show() {
        System.out.println("普通的 私有方法");
    }

    public static void start() {
        System.out.println("Start");
        startShow();
    }

    public default void endT() {
        System.out.println("endT");
        show();
    }

    public static void end() {
        System.out.println("End");
        startShow();
    }

    // 静态的私有方法，给静态方法服务
    private static void startShow() {
        System.out.println("startShow -- 为静态方法服务");
    }
}
