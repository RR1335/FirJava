package biz.baijing.objectset;

import java.util.ArrayList;
import java.util.Scanner;

public class SetTraverseScanner {
    public static void main(String[] args) {
        ArrayList<StudentClass> sc = new ArrayList<>();
        // 集合的默认长度为 0 ，没有赋值的时候 size() 是 0
        // 集合的长度，由 add 增加的元素确定的

        // 没有 add() 赋值的时候，for 循环因为 size() 0 ，直接结束并为执行
/*        for (int i = 0; i < sc.size() ; i++) {
            System.out.println("exec ？ or No");
//               这句话并未执行
        }*/

        Scanner scin = new Scanner(System.in);
        System.out.println("请确定要录入的学生数：");
        int s_num = scin.nextInt();

        for (int i = 0; i < s_num ; i++) {
            StudentClass stu = new StudentClass();
            System.out.println("请输入学生id，姓名，年龄： ");

            int id = scin.nextInt();
            stu.setId(id);
            String name = scin.next();
            stu.setName(name);
            int age = scin.nextInt();
            stu.setAge(age);

            sc.add(stu);
        }

        for (int i = 0; i < sc.size() ; i++) {
            StudentClass stu = sc.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge());
        }



    }
}
