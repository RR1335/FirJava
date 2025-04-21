package thread.baijing.base;

public class ThreadDefClass extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "Hello World!!");
        }

    }


}
