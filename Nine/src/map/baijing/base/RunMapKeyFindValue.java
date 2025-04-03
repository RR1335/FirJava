package map.baijing.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RunMapKeyFindValue {
    public static void main(String[] args) {

        Map<Integer,String> m = new HashMap<>();

        m.put(1,"西瓜");
        m.put(2,"香醋");
        m.put(3,"滑雪");

        // Key find Value

        // 将 key 放入到一个集合中
        Set<Integer> keys = m.keySet();

        for (Integer key : keys) {
            System.out.println(key);
            // 获取 key 的 value
            System.out.println(m.get(key));
            System.out.println(key + " = " +m.get(key));
        }

//        keys.iterator();
//        keys.forEach(System.out::println);

    }
}
