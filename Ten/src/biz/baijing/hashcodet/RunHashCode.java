package biz.baijing.hashcodet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RunHashCode {
    public static void main(String[] args) {

        HashMap<Student,String> hm = new HashMap<>();

        Student s1 = new Student("Sam",20);
        Student s2 = new Student("Jack",22);
        Student s3 = new Student("Tom",19);

        // 年龄相同 ， 3️s4 取代了 s2
        Student s4 = new Student("Rise",22);


        hm.put(s1,"山东");
        hm.put(s2,"湖北");
        hm.put(s3,"云南");

        hm.put(s4,"四川");

        Set<Student> keys = hm.keySet();
        for (Student s : keys) {
            String v = hm.get(s);
            System.out.println(s + " - " + v);
        }

        Set<Map.Entry<Student,String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student s = entry.getKey();
            System.out.println(s + " - " + entry.getValue());
        }

        hm.forEach((k,v)->{System.out.println(k + " - " + v);});

    }
}
