package biz.baijing.Animals;

public class BreedAnimal {
    public static void main(String[] args) {

        Person p = new Person("- 老实人 -",30);

        Person p1 = new Person("- 机灵鬼 -",27);

        Dog d = new Dog(2,"- 黑白花 -");

        Cat c = new Cat(12,"- 五彩斑斓的黑 -");

        p.keepPet(d,"骨头");
//        d.lookHome();
        p1.keepPet(c,"- 于做的猫罐头 -");
//        c.catchMouse();
    }
}
