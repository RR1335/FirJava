package iterator.baijing.base;

import java.util.ArrayList;
import java.util.Collection;

public class RunForPlus {
    public static void main(String[] args) {


        Collection<String> col = new ArrayList<String>();

        col.add("如花");
        col.add("如月");
        col.add("Integer");
        col.add("Character");
        col.add("Collection");

        int i = 0;
        for (String str : col) {
            i ++ ;
            System.out.println(i + " - " + str);
        }

        System.out.println(col);

        col.iterator();


    }
}
