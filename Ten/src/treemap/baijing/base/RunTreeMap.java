package treemap.baijing.base;

import java.util.Comparator;
import java.util.TreeMap;

public class RunTreeMap {
    public static void main(String[] args) {

//        TreeMap<Integer,String> tm = new TreeMap<>();
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1 ： 当前要添加的元素
                // o2 ： 标识已经在红黑树中存在的元素
//                return 0; 默认
                // 降序
                return o2.compareTo(o1);
                // 默认或者 是升序
//                return o1.compareTo(o2);
            }
        });

        tm.put(1,"福建");
        tm.put(2,"江苏");
        tm.put(3,"广西");
        tm.put(4,"内蒙");
        tm.put(5,"辽宁");

        //  默认按照键的生序排序 _ Integer Double  /  String ASCII 表生序
        System.out.println(tm);



    }
}
