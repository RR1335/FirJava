package com.baijing.j_2;



public class JT_1 {
    public static void main(String[] args) {
        String name = "花蝴蝶";

//        Teacher t = new Teacher();
        com.baijing.j_1.Teacher t = new com.baijing.j_1.Teacher();
        String tname = t.setName(name);
        int tage = t.setAge(19);

        System.out.println(tage + tname);

        // 导包 ？ 当遇到同名时，会直接用 全类名而不是导包
        com.baijing.j_1_1.Teacher t_1 = new com.baijing.j_1_1.Teacher();
        String t_name = t_1.setName("清晨的太阳");
        int t_age = t_1.setAge(21);
        System.out.println(t_name + t_age);
    }

}
