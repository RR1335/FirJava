package stream.baijing.base;

import java.util.ArrayList;

public class RunStream {
    public static void main(String[] args) {

        ArrayList<String> arrlist = new ArrayList<>();

        arrlist.add("一剪梅");
        arrlist.add("两岸情");
        arrlist.add("一江春水");
        arrlist.add("两片浮萍");
        arrlist.add("一只鸭子");
        arrlist.add("五辆车");
        arrlist.add("一本二本");

        arrlist.stream().filter(name -> name.startsWith("一"))
                .filter(name -> name.length() == 4)
                .forEach(name -> System.out.println(name));

//        ArrayList<String> al = new ArrayList<>();
//
//        for (String name : arrlist) {
//            if(name.startsWith("一")) {
//                al.add(name);
//            }
//        }
//        System.out.println(al);
//
//        ArrayList<String> al1 = new ArrayList<>();
//
//        for (String name : al) {
//            if (name.length() == 4) {
//                al1.add(name);
//            }
//        }
//        System.out.println(al1);
//
//        for (String name : al1) {
//            System.out.println(name);
//        }

    }
}
