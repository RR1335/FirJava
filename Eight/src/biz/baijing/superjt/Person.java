package biz.baijing.superjt;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("Person ， 是父类；无参构造。");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
