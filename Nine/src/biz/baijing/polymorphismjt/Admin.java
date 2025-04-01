package biz.baijing.polymorphismjt;

public class Admin extends Person{

    @Override
    public void show(){
        System.out.println("Admin -" + getName() +" " + getAge());
    }

}
