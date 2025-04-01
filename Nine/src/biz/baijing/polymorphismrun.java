package biz.baijing;

public class polymorphismrun {
    public static void main(String[] args) {
        // 编译和运行，都看左边
        Animal a = new Dog();
        // 左边是 Animal ，所以这里的 a.name 输出： 动物世界
        System.out.println(a.name);
        System.out.println(a);
        System.out.println("Animal -" + System.identityHashCode(a.name));
//        System.out.println("Dog -" +System.identityHashCode(a));
        // 编译看左边，运行看右边
        // 实际运行的是子类方法
        a.show();

        Animal ac = new Cat();

        System.out.println(ac.name);
        // 成员方法： 子类对父类 method 进行了 @Override ，虚方法表中会把父类的方法覆盖。
        ac.show();

    }
}

class Animal{
    String name = "动物世界";

    public void show() {
        System.out.println("Animal Method -" + name);
    }
}

class Dog extends Animal{
    String name = "小狗真可爱";

    public void show() {
        System.out.println("Dog Method -" + name);
    }
}

class Cat extends Animal{
    String name = "猫咪是天使";

    public void show() {
        System.out.println("Cat  Method -" + name);
    }
}
