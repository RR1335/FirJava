package ai.baijing.interfacejt;

public class Dog extends Animal implements Swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头，吐骨头杆儿。");
    }

    @Override
    public void swim() {
        System.out.println("狗在游泳 —— 狗抛儿");
    }
}
