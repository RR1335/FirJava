package com.baijing.employee;

public class emptj {
    public static void main(String[] args) {
        Manager m = new Manager(001,"Sam",18900.12,1200);
        System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getSalary()+"\t"+m.getBonus()) ;
        m.eat();
        m.work();

        Cook c = new Cook();
        c.setId(002);
        c.setName("阿木子");
        c.setSalary(3902.78);
        System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getSalary());

        c.eat();
        c.work();



    }
}
