package treemap.baijing.example;

import java.util.TreeMap;

public class RunTreeMapStu {
    public static void main(String[] args) {

        TreeMap<Student,String> tmstu = new TreeMap<>();

        Student stu01 = new Student("一剪梅",20);
        Student stu02 = new Student("江夏镇",21);
        Student stu03 = new Student("江如虎",22);
        Student stu04 = new Student("一生所爱",19);
        Student stu05 = new Student("三生万物",20);

        tmstu.put(stu01,"芜湖");
        tmstu.put(stu02,"杭州");
        tmstu.put(stu03,"银川");
        tmstu.put(stu04,"呼和浩特");
        tmstu.put(stu05,"哈尔滨");

        System.out.println(tmstu);


    }
}
