package biz.baijing.objectset;

import java.util.ArrayList;

public class SetSearchId {
    public static void main(String[] args) {
        ArrayList<StudentClass> al = new ArrayList<>();

        StudentClass s1 = new StudentClass(001,"San",20);
        StudentClass s2 = new StudentClass(002,"Veen",18);
        StudentClass s3 = new StudentClass(003,"GEEE",19);

        al.add(s1);
        al.add(s2);
        al.add(s3);

        System.out.println(contains(al,002));

        String index_name = "San";
        int stu_index = getObjectIndex(al,index_name);
        if (stu_index != -1) {
            System.out.println("当前索引 index : " + stu_index);
        } else {
            System.out.println("当前索引 index - " + index_name + " 不存在！");
        }

        int index_age = 20;
        ArrayList<StudentClass> al2 = getObjectList(al,index_age);
        System.out.println(al2);
        for (int i = 0; i < al2.size() ; i++) {
            StudentClass stu = al2.get(i);
            System.out.println(stu.getName() + " : " + stu.getAge());
        }

    }

    public static ArrayList<StudentClass> getObjectList(ArrayList<StudentClass> al, int limit_age) {
        // 年龄小于20的学员信息
        ArrayList<StudentClass> result = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {
//            StudentClass stu = al.get(i);
            int age = al.get(i).getAge();
            if (age < limit_age) {
                result.add(al.get(i));
            }
        }

        return result;
    }

/*    public static boolean contains(ArrayList<StudentClass> list, int id) {
        for (int i = 0; i < list.size() ; i++) {
            int uid = list.get(i).getId();
            if (uid == id) {
                return true;
            }
        }
        return false;
    }*/


    public static boolean contains(ArrayList<StudentClass> list, int id) {
/*        for (int i = 0; i < list.size() ; i++) {
            int uid = list.get(i).getId();
            if (uid == id) {
                return true;
            }
        }
        return false;*/

        return  getObjectId(list, id) >= 0 ;
    }


    public static int getObjectIndex(ArrayList<StudentClass> list, String name) {
        for (int i = 0; i < list.size() ; i++) {
            String str_name = list.get(i).getName();
            if (str_name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int getObjectId(ArrayList<StudentClass> list, int id) {
        for (int i = 0; i < list.size() ; i++) {
            int str_id = list.get(i).getId();
            if (str_id == id) {
                return i;
            }
        }
        return -1;
    }
}
