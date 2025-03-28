package biz.baijing.classj;

public class FirClass {
    // 属性
    String name;
    int age;

    public void getAge(int age) {
        System.out.println(age);
    }

    public void getFir(String name, int age) {
        System.out.println(name);
        System.out.println(name + age);
    }
}
