package com.baijing.employee;

public class Manager extends Employee {
    double bonus;

    public Manager() {

    }
    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("正在做管理工作 ……");
    }
}
