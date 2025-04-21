package multithreading.baijing.channel;

import java.util.concurrent.ArrayBlockingQueue;

public class ChannelThreadRun {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(1);

        ProducerClass pc = new ProducerClass(abq);
        ConsumerClass cc = new ConsumerClass(abq);

        pc.setName("Producer");
        cc.setName("Consumer");

        pc.start();
        cc.start();

    }
}
