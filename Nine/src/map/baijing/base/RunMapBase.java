package map.baijing.base;

import java.util.HashMap;
import java.util.Map;

public class RunMapBase {
    public static void main(String[] args) {

        // 多态的方式创建 Map 对象，右侧是 Map 的实现方法
        Map<String,String> m = new HashMap<>();

        // Entry键值对添加
        m.put("木瓜","西瓜");
        m.put("酱油","香醋");
        m.put("古镇","滑雪");

        System.out.println(m);

        String v= m.put("古镇","划船");
        System.out.println(m);
        // put 返回值是被替换的元素“值”
        System.out.println(v);

        String cv = m.put("大海","浪花");
        System.out.println(cv);
        System.out.println(m);

        String rv = m.remove("古镇");
        // 返回 Key value 的 value
        System.out.println(rv);
        System.out.println(m);

        boolean bv = m.containsKey("木兰花");
        System.out.println(bv);
        System.out.println(m);

        boolean bv1 = m.containsKey("酱油");
        System.out.println(bv1);
        System.out.println(m);

        boolean bvv = m.containsValue("西瓜");
        System.out.println(bvv);
        System.out.println(m);

        boolean res =  m.isEmpty();
        System.out.println(res);

        int s = m.size();
        System.out.println(s);

        // 无返回值
        m.clear();
        System.out.println(m);

        boolean result = m.isEmpty();
        System.out.println(result);

    }
}
