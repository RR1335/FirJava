package biz.baijing.superjt;

public class Student extends Person {


    public Student() {
        // 子类构造方法中隐藏了 super() 方法，访问父类的无参构造
        super();
        System.out.println("Student — 子类的无参构造。");
    }
}
