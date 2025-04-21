package thread.baijing.methods;

public class ThreadRunClass extends Thread{

    public ThreadRunClass() {
    }

    public ThreadRunClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + "Char ++");
    }

}
