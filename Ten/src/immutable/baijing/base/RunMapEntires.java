package immutable.baijing.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RunMapEntires {
    public static void main(String[] args) {

        HashMap<String,String> hm = new HashMap<>();

        hm.put("Tom", "美国");
        hm.put("杰西卡", "苏联");
        hm.put("东生", "宁夏");
        hm.put("广进", "新加坡");
        hm.put("狗蛋", "村村通");
        hm.put("月季", "瓦片");
        hm.put("将军", "南通");
        hm.put("佛祖", "西天");

        Set<Map .Entry<String,String>> entries = hm.entrySet();

        // ofEntries 的形参是一个数组，
        Map.Entry[] entarr = entries.toArray(new Map.Entry[0]);

        Map immmap = Map.ofEntries(entarr);

        System.out.println(immmap);

        // 一行代码解决
        Map< Object,  Object> immhm = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        System.out.println(immhm);

        // 生成不可变Map
        Map<String,String> copyhm = Map.copyOf(hm);
        System.out.println(copyhm);


    }
}
