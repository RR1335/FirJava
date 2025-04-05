package listcollection.baijing.base;

import java.util.ArrayList;
import java.util.List;

public class RunListBase {
    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();

        l.add("a");
        l.add("b");
        l.add("c");

        System.out.println(l);

        l.add(1,"ddd");

        System.out.println(l);

        String i0 = l.remove(3);

        System.out.println(i0);

        String i1 = l.set(0, "ZZZ");
        System.out.println(i1);

        System.out.println(l);

    }
}
