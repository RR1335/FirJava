package biz.baijing.Animals;

public class Animal {
    private int age ;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 行为
    public void eat(String food) {
        System.out.println("动物在吃" + food);
    }
}
