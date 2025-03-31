package biz.baijing.thisT;

public class TestThisAndStatic {
    public static void main(String[] args) {
        StudentTest.techername = "白鲸过海";

        StudentTest stu1 = new StudentTest();
        // this
        System.out.println("stu1 -" +stu1);
        stu1.name = "牡丹花";
        stu1.age = 18;

        stu1.show();

        System.out.println(" --------- 分割线 __________");

        StudentTest stu2 = new StudentTest();
        System.out.println("stu2 -" +stu2);
        stu2.name = "月季花";
        stu2.age = 20;

        stu2.show();

    }
}
