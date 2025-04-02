package ai.baijing.interfacejt;

public class Rabbit extends Animal {

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Rabbit eat 鲜美的草……");
    }
}
