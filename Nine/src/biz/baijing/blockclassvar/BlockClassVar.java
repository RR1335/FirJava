package biz.baijing.blockclassvar;

public class BlockClassVar {
    String name;
    int age;

    // 构造代码块，在创建构造方法的时候执行
    {
        System.out.println("BlockClassVar - 开始创建类");
    }

    public BlockClassVar() {
        System.out.println("BlockClassVar - No params");
    }

    public BlockClassVar(String name, int age) {
        System.out.println("BlockClassVar - params");
        this.name = name;
        this.age = age;
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
}
