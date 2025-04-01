package biz.baijing.polymorphismjt;

public class Teacher extends Person {

    @Override
    public void show(){
        System.out.println("Teacher -" + getName() +" " + getAge());
    }
}
