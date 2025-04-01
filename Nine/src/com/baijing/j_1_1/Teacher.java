package com.baijing.j_1_1;

public class Teacher {
    private String name;
    private int age;

    public Teacher() {

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getAge(int i) {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    // 行为
    public void sayC(String name) {
        System.out.println(name + "在讲课 ……");
    }

}
