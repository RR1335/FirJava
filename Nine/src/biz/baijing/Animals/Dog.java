package biz.baijing.Animals;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    // 行为
    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗，抱住" + food + "猛吃");
    }

    public  void lookHome(  ) {
        System.out.println("狗，在看家 ……");
    }
}
