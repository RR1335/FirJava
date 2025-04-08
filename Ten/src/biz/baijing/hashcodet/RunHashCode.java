package biz.baijing.hashcodet;

import java.util.HashMap;
import java.util.Set;

public class RunHashCode {
    public static void main(String[] args) {

        HashMap<Student,String> hm = new HashMap<>();

        Student s1 = new Student("Sam",20);
        Student s2 = new Student("Jack",22);
        Student s3 = new Student("Tom",19);


        hm.put(s1,"山东");
        hm.put(s2,"湖北");
        hm.put(s3,"云南");

        Set<Student> keys = hm.keySet();
        for (Student s : keys) {
            String v = hm.get(s);
            System.out.println(s + " - " + v);
        }

    }
}
