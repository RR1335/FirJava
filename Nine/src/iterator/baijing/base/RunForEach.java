package iterator.baijing.base;

import java.util.ArrayList;
import java.util.Collection;

public class RunForEach {
    public static void main(String[] args) {

        Collection<String> col = new ArrayList<String>();

        col.add("如花");
        col.add("如月");
        col.add("Integer");
        col.add("Character");
        col.add("Collection");

//        col.forEach(new Consumer<String>() {
//            // s 集合中的每一个数据
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//
//        // lambda 表达式
//        col.forEach((String s) -> {
//            System.out.println(s);
//        });

        col.forEach(System.out::println);

    }
}
