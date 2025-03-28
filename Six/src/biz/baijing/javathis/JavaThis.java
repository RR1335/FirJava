package biz.baijing.javathis;

public class JavaThis {
    // 成员变量
    private String name;
    private int    age;

    // 参考
//    public void setAge(int agen) {
//        // 局部变量
//        // agen 改 成 age ，输出 age 非法参数
//
//        int age = agen;
//
//        if ( 100 >= this.age && this.age >= 18) {
//            age = this.age;
//        } else {
//            System.out.println("Age 不符合标准");
//        }
//    }


    public void setName(String name) {
        // name 局部变量
        // this.name 是成员变量
        this.name = name;
    }

    public String getName() {
        // 返回成员变量的值
        return name;
        // 如下逻辑
//        return this.name;
    }


    // 应该的结构是这个
    // this.age 调用了成员变量，getAge 在 main 被调用会输出值。
    public void setAge1(int age) {
        this.age = age;               // 错误语句
        if ( 50 >= this.age && this.age >= 18) {
            age = this.age;
        } else {
            System.out.println(this.age + "不符合标准");
        }
    }

    // 正确的逻辑
    public  void setAge(int age) {
        // age 是局部变量，
        // main 调用 getAge ，年龄不符合标准则输出 0
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println(age + "不符合标准年龄");
        }
    }


    public int getAge() {
        return age;
    }
}
