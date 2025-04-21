package thread.baijing.yield;

public class ThreadSoRun {
    public static void main(String[] args) {

        ThreadSoClass tr1 = new ThreadSoClass();
        ThreadSoClass tr2 = new ThreadSoClass();

        tr1.setName("One 天女散花");
        tr2.setName("Two 帅锅锅");

        tr1.start();
        tr2.start();

    }
}
