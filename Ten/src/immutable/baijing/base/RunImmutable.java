package immutable.baijing.base;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RunImmutable {
    public static void main(String[] args) {
        // 利用 of 创建不可变 Set List

        List<String> l = List.of("q","o","Z");

        System.out.println(l);

        System.out.println(l.get(2));

        Set<String> s = Set.of("q","o","Z");
        System.out.println(s);

        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Map<String,String> mm = Map.of("Tom","美国","杰西卡","苏联");

        Set<Map.Entry<String,String>> en = mm.entrySet();
        for(Map.Entry<String,String> entry:en){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }

}
