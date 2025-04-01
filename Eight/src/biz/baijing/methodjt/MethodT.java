package biz.baijing.methodjt;

public class MethodT {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.course();
    }
}

class Person {
    public void say() {
        System.out.println("讲话 ……");
    }

    public void drink() {
        System.out.println("喝水 ……");
    }
}

class Teacher extends Person {

    public void say() {
        System.out.println("老师，上课，讲话 ……");
    }

    public void drink() {
        System.out.println("老师，上课，喝水 ……");
    }

    public void  course(){
        say();
        drink();

        // 直接找父类
        super.say();
        super.drink();
    }
}
