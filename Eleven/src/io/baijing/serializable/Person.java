package io.baijing.serializable;

import java.io.Serializable;

/*
Serializable —— 接口没有抽象方法，标记型接口。
标识 Person 能被序列化。
 */
public class Person implements Serializable {
    public String name;
    public int age;

    public Person(String name, int age) {

    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
