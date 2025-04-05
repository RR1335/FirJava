package iterator.baijing.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RunIterator {
    public static void main(String[] args) {

        Collection<String>  col = new ArrayList<String>();

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
        }
        // 第一： 迭代器结束，迭代器索引的指针不会复位：即不会回到 0 索引
//        需要指针复位，则需要重新定义一个新的迭代器
        // 第二： 迭代器指针指向了集合最后一个元素之后的「空」位置后，会报错： Exception in thread "main" java.util.NoSuchElementException
        System.out.println(iter.next() );

//        Iterator<String> iter2 = col.iterator();
//        while (iter2.hasNext()) {
//            System.out.println("新的 iterator -" +iter2.next());
//        }



    }
}
