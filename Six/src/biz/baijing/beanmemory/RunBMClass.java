package biz.baijing.beanmemory;

public class RunBMClass {
    public static void main(String[] args) {
        BMClass bmc1 = new BMClass();

        String name = "如花 ！！！";

       int addressip = System.identityHashCode(name);
       System.out.println("main - " + addressip);

        System.out.println("name in : " + name);
        bmc1.setName(name);
        System.out.println("name out : " + name);

        System.out.println("getName() 1 : " + bmc1.getName());

        System.out.println(" _______________- ");

        BMClass bmc2 = new BMClass();

        String name2 = "乐之山";

        int addressip1 = System.identityHashCode(name2);
        System.out.println("main - " + addressip1);

        bmc2.setName(name2);

        System.out.println("getName() 2 : " + bmc2.getName());

    }
}

/*
// 结果

main - 918221580
name in : 如花 ！！！
This.name : null
First this.name - 0
name: 如花 ！！！
This.name - update: 如花 ！！！
Second this.name - 918221580        // main 相同的内存地址
name - update: 如花 ！！！
second name : 三月三
name out : 如花 ！！！
getName() 1 : 如花 ！！！
 _______________-
main - 1392838282
This.name : null
First this.name - 0
name: 乐之山
This.name - update: 乐之山
Second this.name - 1392838282         // main 相同的 内存地址
name - update: 乐之山
second name : 三月三
getName() 2 : 乐之山

Process finished with exit code 0

 */