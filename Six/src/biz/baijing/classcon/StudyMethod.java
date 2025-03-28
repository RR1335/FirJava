package biz.baijing.classcon;

public class StudyMethod {
    private String name;
    private int age;

    // 如果没有任何构造函数，则 new 会自动创建一个构造函数
//    public  StudyMethod() {
//        System.out.println("执行了么有呢，空的构造函数。");
//    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
