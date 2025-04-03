package map.baijing.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RunMapEntryObj {
    public static void main(String[] args) {


        Map<Integer,String> m = new HashMap<>();

        m.put(1,"西瓜");
        m.put(2,"香醋");
        m.put(3,"滑雪");

        // Set 的泛型
        // import java.util.Map.Entry; 这里的 Entry 直接写；否则写成 Map.Entry
        Set<Entry<Integer,String>> entries = m.entrySet();

        // for 增强
        for (Entry<Integer,String> entry : entries) {
            int k = entry.getKey();
            String v = entry.getValue();

            System.out.println(k+" : "+v);
        }


    }
}
