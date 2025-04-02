package io.baijing.abstractjt;

public class AbstractJ {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.setAge(18);
        t.setName("如花美眷");

        System.out.println(t.getAge());
        System.out.println(t.getName());

    }
}
