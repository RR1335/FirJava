package ai.baijing.interfacejt;

public class Frog extends Animal implements Swim{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Frog eat - 哇哇大叫的吃虫子" + getAge() + "的" + getName());
    }

    @Override
    public void swim() {
        System.out.println(getName() + "青蛙在游泳 …… 蛙泳 ， 呱呱呱");
    }
}
