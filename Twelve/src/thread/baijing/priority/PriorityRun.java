package thread.baijing.priority;

public class PriorityRun {
    public static void main(String[] args) {

        PriorityClass prun = new PriorityClass();

        Thread th1  = new  Thread(prun,"t1 - ");
        Thread th2  = new  Thread(prun,"t2 - ");


/*
        System.out.println(th1.getPriority()); // 默认优先级
        System.out.println(th2.getPriority()); // 默认 th1 th2 : 5
*/
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.MAX_PRIORITY);

        th1.start();
        th2.start();


    }
}
