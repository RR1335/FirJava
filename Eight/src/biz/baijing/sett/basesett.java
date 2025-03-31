package biz.baijing.sett;

import java.util.ArrayList;

public class basesett {
    public static void main(String[] args) {
        // 泛型 ， 集合的类型
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String>  al = new ArrayList<>();

        // 打印对象，是存储的内容
        // 打印内容用 [] 包起来
        // 集合存储引用类型，不能存基础类型
        System.out.println(list);

    }
}
