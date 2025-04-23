package reflection.baijing.constructors;

public class StudentClass {
    private String name;
    private int age;
    private String address;

    public StudentClass() {

    }

    public StudentClass(String name) {
        this.name = name;
    }

    protected StudentClass(int age) {
        this.age = age;
    }

    private StudentClass(int age, String address) {
        this.age = age;
        this.address = address;
    }

    public StudentClass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
