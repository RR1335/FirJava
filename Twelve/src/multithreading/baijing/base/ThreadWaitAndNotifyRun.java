package multithreading.baijing.base;

public class ThreadWaitAndNotifyRun {
    public static void main(String[] args) {

            ProducerClass p = new ProducerClass();
            ConsumerClass c = new ConsumerClass();

            p.setName("Producer");
            c.setName("Consumer");

            p.start();
            c.start();

    }
}
