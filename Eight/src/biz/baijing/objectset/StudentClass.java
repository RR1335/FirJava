package biz.baijing.objectset;

public class StudentClass {
    private int id;
    private String name;
    private int age;

    public StudentClass(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public StudentClass() {}

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
