package io.baijing.abstractjt;

public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("老师的工作，是努力教书。");
    }
}
