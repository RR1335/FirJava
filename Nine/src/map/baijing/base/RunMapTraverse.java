package map.baijing.base;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class RunMapTraverse {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();

        m.put(1,"西瓜");
        m.put(2,"香醋");
        m.put(3,"滑雪");


        m.forEach((new BiConsumer<Integer, String>() {
                    @Override
                    public void accept(Integer key, String value) {
                        System.out.println(key + " : " + value);
                    }
                })
        );

        // lamdba 表达式
        m.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        // 简化
        m.forEach((k, v) -> System.out.println(k + " : " + v));

    }
}
