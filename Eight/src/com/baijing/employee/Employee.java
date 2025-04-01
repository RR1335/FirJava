package com.baijing.employee;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee() {

    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 工作
    public void work() {
        System.out.println("work ... ...");
    }

    // 吃饭
    public void eat() {
        System.out.println("eat ... ...");
    }
}
