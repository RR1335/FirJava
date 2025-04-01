package biz.baijing.Objectpolymorphism;

public class ObjectCJ {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.show();

        // 无法访问 class 中独有的方法，如果需要访问则进行类型转换
//        a.limitDog();

        // 强制类型转换，类似 int i ; byte b = (int)i
        Dog d = (Dog) a;
        d.show();
        d.limitDog();

        // 会提示错误
/*        Exception in thread "main" java.lang.ClassCastException: class biz.baijing.Objectpolymorphism.Dog cannot be cast to class biz.baijing.Objectpolymorphism.Cat (biz.baijing.Objectpolymorphism.Dog and biz.baijing.Objectpolymorphism.Cat are in unnamed module of loader 'app')
	at biz.baijing.Objectpolymorphism.ObjectCJ.main(ObjectCJ.java:19)*/
//        Cat c = (Cat) a;
//        c.show();

        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.show();
        } else  if (a instanceof Dog) {
            Dog dd = (Dog)a;
            System.out.println("if 判断");
            dd.show();
            dd.limitDog();
        } else {
            System.out.println("类型转换失败。");
        }

    }
}

class Animal{
    String name = "动物世界";

    public void show() {
        System.out.println("Animal Method -" + name);
    }
}

class Dog extends Animal {
    String name = "小狗真可爱";

    public void show() {
        System.out.println("Dog Method -" + name);
    }

    public void limitDog() {
        System.out.println("Dog 强制转化 Dog d = (Dog)a -" + name);
    }
}

class Cat extends Animal {
    String name = "猫咪是天使";

    public void show() {
        System.out.println("Cat  Method -" + name);
    }
}
