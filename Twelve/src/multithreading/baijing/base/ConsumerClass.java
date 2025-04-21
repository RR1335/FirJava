package multithreading.baijing.base;

public class ConsumerClass extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (ChannelClass.lock) {
                if (ChannelClass.count == 0) {
                    break;
                }else {
                    if (ChannelClass.channel == 0) {
                        try {
                            ChannelClass.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        System.out.println("第 " + ChannelClass.count);
                        ChannelClass.count--;
                        ChannelClass.lock.notifyAll();


                        ChannelClass.channel = 0;
                    }
                }
            }
        }
    }

}
