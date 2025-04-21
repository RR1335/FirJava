package multithreading.baijing.channel;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerClass extends Thread {

    ArrayBlockingQueue<String> queue;

    public ProducerClass(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("Producer");
                System.out.println("Producer is running");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
