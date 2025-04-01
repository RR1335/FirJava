package com.baijing.thisnoparams;

public class Student {
    String name;
    int age;
    String school;

    public Student() {
        // 调用本类其它构造方法
        // 虚拟机不会再添加 super()
        this(null,0,"白鲸 technology Cor.");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
