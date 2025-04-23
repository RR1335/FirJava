package reflection.baijing.methods;

public class StudentsClass {
    private String name;
    private int age;
    private String address;

    public StudentsClass(String name, int age, String address) {
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

    public void sleep(){
        System.out.println("sleep");
    }

    private void eat(String food){
        System.out.println("eat" + food);
    }

    public String toString() {
        return "Student Name: " + name + " Age: " + age + " Address: " + address;
    }
}
