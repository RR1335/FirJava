package treemap.baijing.example;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name :" + name + ", age :" + age + "}";
    }

    @Override
    public int compareTo(Student o) {

        /*
        返回值：
        负数 —— 表示当前要添加的元素是小的，存在左边；
        正数 —— 表示当前要添加的元素是大的，存在右边；
        0 —— 标识当前添加的元素已经存在，舍弃
         */

        int compare = this.age - o.age;

        return compare != 0 ? compare : this.name.compareTo(o.name);
    }
}
