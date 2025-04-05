package listcollection.baijing.base;

import java.util.ArrayList;
import java.util.List;

public class RunListRemove {
    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();

        l.add("a");
        l.add("b");
        l.add("c");

        List<Integer> lint = new ArrayList<>();

        lint.add(1);
        lint.add(2);
        lint.add(3);

        System.out.println(lint);

        // 为何删除的不是 1 这个元素；
        // 重载，优先调用 实参 和 形参一样的类型
        int Lr = lint.remove(1);
        System.out.println(Lr);

        System.out.println(lint);

        Integer i = Integer.valueOf(1); // 先保证类型一致
        boolean ilr = lint.remove(i);
        System.out.println(ilr);

        System.out.println(lint);

    }
}
