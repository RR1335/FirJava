package com.baijing.memoryclass;

public class Student {
    String name;
    int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void show(){
        System.out.println(name + " " + age);
    }
}
