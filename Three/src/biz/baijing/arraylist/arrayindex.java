package biz.baijing.arraylist;

public class arrayindex {
    public static void main(String[] args) {
        String[] stu = new String[30];

        stu[0] = "San";
        stu[1] = "三";

        System.out.println(stu[0]);
        System.out.println(stu[1]);
        // 没有定义的 初始化值 null  |  整数类型 0 ，浮点类型 0.0  ｜ 字符类型 /u0000 (空格）
        // boolean  默认 false  |  引用数据类型 null 
        System.out.println(stu[2]);
    }
}
