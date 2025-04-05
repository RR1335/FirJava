package iterator.baijing.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RunIteratorRemove {
    public static void main(String[] args) {

        Collection<String> col = new ArrayList<String>();

        col.add("如花");
        col.add("如月");
        col.add("Integer");
        col.add("Character");
        col.add("Collection");

        // 创建迭代器，即：迭代器指针指向 0索引
        Iterator<String> iter = col.iterator();

        while (iter.hasNext()) {
            // 获取元素，并移动指针到下一个元素
            String str = iter.next();
            System.out.println(str);
            if ("Integer".equals(str)) {
                // 删除元素
                iter.remove();
                /*
                如果使用 col.remove()会报错。
                 */
            }
        }
        System.out.println(col);

        // 迭代器 while 循环外， Collection 集合操作正常使用
        col.add("Yes - No while, Is OK " );
        col.remove("Character" );
        System.out.println(col + " _ Remove Character");

    }
}
