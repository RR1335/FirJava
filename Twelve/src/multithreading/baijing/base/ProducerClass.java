package multithreading.baijing.base;

public class ProducerClass extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (ChannelClass.lock) {
                if (ChannelClass.count == 0) {
                    break;
                }else {
                    if (ChannelClass.channel == 1) {
                        try {
                            ChannelClass.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        System.out.println("Channel + 1");
                        ChannelClass.channel = 1;
                        ChannelClass.lock.notifyAll();
                    }
                }
            }
        }
    }
}
