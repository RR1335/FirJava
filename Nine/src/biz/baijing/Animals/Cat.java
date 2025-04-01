package biz.baijing.Animals;

public class Cat extends Animal {

    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫，眯着眼吃" + food);
    }

    // 独有的行为
    public void catchMouse() {
        System.out.println("猫爪老鼠 ……");
    }
}
