package linkedhashmap.baijing.base;

import java.util.LinkedHashMap;

public class RunLinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> linkedhm = new LinkedHashMap<>();

        linkedhm.put("A",11);
        linkedhm.put("B",12);
        linkedhm.put("A",13);
        linkedhm.put("A",11);
        linkedhm.put("E",15);

        System.out.println(linkedhm);
        // {A=11, B=12, E=15}
        // 有序 ， 不重复 ，无索引

    }
}
