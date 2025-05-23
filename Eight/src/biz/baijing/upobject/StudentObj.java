package biz.baijing.upobject;

public class StudentObj {
    private int id;
    private String name;
    private int age;
    private String gender;

    // 所有对象共享 techername
    public static  String techername;

    public StudentObj() {
    }

    public StudentObj(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // 行为
    public void study() {
        System.out.println(name + "正在学习 ～～～");
    }

    public  void show() {
        System.out.println(id + " | " + name + " | " + age + " | " + gender + " | " + techername);
    }
}
