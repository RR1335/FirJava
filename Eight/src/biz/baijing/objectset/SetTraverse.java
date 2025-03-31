package biz.baijing.objectset;

import java.util.ArrayList;

public class SetTraverse {
    public static void main(String[] args) {
        ArrayList<StudentClass> stu = new ArrayList<>();

        StudentClass s1 = new StudentClass(001,"San",20);
        StudentClass s2 = new StudentClass(002,"Dan",21);
        StudentClass s3 = new StudentClass(003,"Sam",19);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

        for (int i = 0; i < stu.size(); i++) {
            StudentClass stu1 = stu.get(i);
            System.out.println(stu1);
            System.out.println(stu1.getName() + " " + stu1.getAge());
        }

    }
}
