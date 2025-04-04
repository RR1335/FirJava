package collection.baijing.contaions;

import java.util.ArrayList;
import java.util.Collection;

public class RunContains {
    public static void main(String[] args) {
        Collection<Student> col = new ArrayList<>();

        Student s1 = new Student("Tom",20);
        Student s2 = new Student("Jack",22);
        Student s3 = new Student("三月三",19);

        col.add(s1);
        col.add(s2);
        col.add(s3);

        Student s4 = new Student("Jack",22);

        boolean ct = col.contains(s4);
        // 自定义对象，没有从写equals方法；则，默认是Object类中的equals方法进行判断
        // Object 中，equals方法依赖地址“值”进行判定。
        // 同名同姓就认为是同一个学生 —— 需求
        // 需要在 javabean 自定义对象中重写 equals 方法

//        重写后的 equals 比较的就是属性值
//        重写后结果为 true
        System.out.println(ct); // false

    }
}
