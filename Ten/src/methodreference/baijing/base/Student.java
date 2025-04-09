package methodreference.baijing.base;

public class Student {
    private String name;
    private int age;

    public Student() {

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 构造方法，方法引用
    public Student(String str) {
        String[] sp = str.split(",");
        this.name = sp[0];
        this.age = Integer.parseInt(sp[1]);
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

    public String toString() {
        return "Student { name= " + name + ", age= " + age + " }";
    }
}
