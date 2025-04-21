package multithreading.baijing.channel;

import java.util.concurrent.ArrayBlockingQueue;

public class ConsumerClass extends Thread {

    ArrayBlockingQueue<String> queue;

    public ConsumerClass(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String something = queue.take();
                System.out.println(something);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
