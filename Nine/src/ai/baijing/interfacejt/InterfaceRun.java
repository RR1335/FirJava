package ai.baijing.interfacejt;

public class InterfaceRun {
    public static void main(String[] args) {
        Frog f = new Frog();
        f.setName("小青蛙的好哥儿俩");
        f.setAge(2);

        f.eat();
        f.swim();

        Dog d = new Dog();
        d.setName("汪汪汪的小布偶");
        d.setAge(7);

        d.eat();
        d.swim();

        Rabbit r = new Rabbit();

        r.eat();

    }
}
