package biz.baijing.polymorphismjt;

public class Student extends Person {

    @Override
    public void show() {
        System.out.println("Student -"  + getName() +" " + getAge());
    }

}
