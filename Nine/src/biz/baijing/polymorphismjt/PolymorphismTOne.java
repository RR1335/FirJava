package biz.baijing.polymorphismjt;

public class PolymorphismTOne {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.setName("Tom");

        Teacher t = new Teacher();
        t.setAge(58);
        t.setName("临江仙人");

        Admin a = new Admin();
        a.setAge(38);
        a.setName("一招鲜");

        register(s);

        register(t);

        register(a);
    }

    // register 能接受 student teacher and admin 三个 class
    // register 的 params 只能是 这三个 class 的父类
    public  static  void register(Person p) {
        p.show();
    }
}
