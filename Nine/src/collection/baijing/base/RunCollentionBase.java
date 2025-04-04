package collection.baijing.base;

import java.util.ArrayList;
import java.util.Collection;

public class RunCollentionBase {
    public static void main(String[] args) {

        // 类型 变量 实现类，通过多态的方式定义
        Collection<String> col = new ArrayList<>();

        col.add("鸭梨");
        col.add("农夫山泉");
        col.add("鼓噪");
        col.add("台灯");
        col.add("绿植");

        System.out.println(col);

        col.add("First");
        // List 允许重复，有序；添加相同元素返回值 true
        boolean tcol = col.add("First");
        System.out.println(tcol);
        System.out.println(col);

        // set 没有索引，remove 是共性方法，无法通过索引删除，元素对象删除
        col.remove("绿植");
        System.out.println(col);
        boolean tre = col.remove("First");
        System.out.println(tre);
        System.out.println(col);
        // 删除元素不存在 ，失败
        boolean fre = col.remove("Second");
        System.out.println(fre);
        System.out.println(col);

        boolean bc = col.contains("First");
        System.out.println(bc);
        System.out.println(col);
        boolean bc1 = col.contains("Second");
        System.out.println(bc1);
        System.out.println(col);


        boolean be = col.isEmpty();
        System.out.println(be);

        int n = col.size();
        System.out.println(n);

        // 清空
        col.clear();
        System.out.println(col);
        System.out.println(col.size());
        System.out.println(col.isEmpty());

    }
}
