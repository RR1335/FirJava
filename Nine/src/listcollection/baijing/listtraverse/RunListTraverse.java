package listcollection.baijing.listtraverse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RunListTraverse {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        System.out.println("List -" +list);

        // iterator
        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println("Iterator" + s);
        }

        // for plus
        for (String s : list) {
            System.out.println("for plus-" + s);
        }

        // lambda
//        list.forEach(System.out::println);
        list.forEach(s -> System.out.println("lambda -" + s));

        // for
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println("for -" + s);
        }

        // ListIterator



    }
}
