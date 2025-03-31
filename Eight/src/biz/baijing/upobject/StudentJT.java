package biz.baijing.upobject;

public class StudentJT {
    public static void main(String[] args) {

        StudentObj.techername = "老怪物";
        StudentObj stu1 = new StudentObj();

        stu1.setId(1);
        stu1.setName("无花果");
        stu1.setAge(20);
        stu1.setGender("男");
//        stu1.techername = "老怪物";

        StudentObj stu2 = new StudentObj();
        stu2.setId(2);
        stu2.setName("牡丹花");
        stu2.setAge(19);
        stu2.setGender("女");


        stu1.study();
        stu1.show();


        stu2.study();
        stu2.show();

        System.out.println(stu1);
        System.out.println(stu2);

        System.out.println("stu1 techername memory : " + System.identityHashCode(stu1.techername));
        System.out.println("stu2 techername memory : " + System.identityHashCode(stu2.techername));
    }
}
