package biz.baijing.Animals;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 行为
//    public void keepPet(Animal a ,String food) {
//        if (a instanceof Cat) {
//            System.out.println("一个" + age + "岁的" + name + "，养了一只" + a.getAge() + "岁的" + a.getColor() + "的猫");
//            a.eat(food);
//        } else if (a instanceof Dog) {
//            System.out.println("一个" + age + "岁的" + name + "，养了一只" + a.getAge() + "岁的" + a.getColor() + "的狗");
//            a.eat(food);
//        } else {
//            System.out.println("无法识别饲养员饲养的动物！");
//        }
//    }

    public void keepPet(Animal a ,String food) {
        if (a instanceof Cat c) {
            System.out.println("一个" + age + "岁的" + name + "，养了一只" + a.getAge() + "岁的" + a.getColor() + "的猫");
            c.eat(food);
            c.catchMouse();
        } else if (a instanceof Dog d) {
            System.out.println("一个" + age + "岁的" + name + "，养了一只" + a.getAge() + "岁的" + a.getColor() + "的狗");
            d.eat(food);
            d.lookHome();
        } else {
            System.out.println("无法识别饲养员饲养的动物！");
        }
    }
}
