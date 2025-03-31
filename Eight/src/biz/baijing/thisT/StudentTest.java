package biz.baijing.thisT;

public class StudentTest {
    String name;
    int age;
    static String techername;

    // 非静态，能调用所有的

    // 实际的调用 public void show(StudentTest this)
    public void show(){
        System.out.println("this -" + this);
//        System.out.println(name + " " + age + " " + techername);
        System.out.println(this.name + " " + this.age + " " + this.techername);

//        this.show2();
        show2();

        // 静态方法能通过对像调用
//        this.methodT();
        methodT();
    }


    public void show2() {
        System.out.println("show2 " + this);
    }

    public static void methodT() {
//         this 提示错误
//        System.out.println("methodT" + this);
        // 静态方法无 this
        // 静态方法 无法调用非静态的 - 成员变量和成员方法
        // 静态方法只能访问静态的
        System.out.println("静态方法测试");
    }

}
