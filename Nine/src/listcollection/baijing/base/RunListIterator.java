package listcollection.baijing.base;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RunListIterator {
    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();

        l.add("a");
        l.add("b");
        l.add("c");

        System.out.println("l -" +l);

        ListIterator<String> liter =  l.listIterator();
        while (liter.hasNext()) {
            String n = liter.next();
            if ("b".equals(n)) {
                liter.add("999");
            }
            System.out.println("ListIterator  -" + n);
        }
        System.out.println("ListIterator 999 -" +l);

        liter.set("010110");
        System.out.println("ListIterator 010110 -" +l);

    }
}
