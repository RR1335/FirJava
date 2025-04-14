package io.baijing.serializable;

import java.io.Serial;
import java.io.Serializable;

/*
Serializable —— 接口没有抽象方法，标记型接口。
标识 Person 能被序列化。
 */
public class Person implements Serializable {

    // 比较合理的方式 通过 Idea j 生成
    // 设置选择
    @Serial
    private static final long serialVersionUID = 5494773074793886378L;
    // serialVersionUID , 在修改 Person Class 后 serialVersionUID 不变不会报错
//    public static final long serialVersionUID = 1L;



    private String name;
    private int age;
    // transient （瞬态关键字）不希望被 序列化 到文件，增加这个修饰符
    private transient String address; // 增加了这个地址信息

    public Person() {

    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
