package biz.baijing.sett;

/*
boolean add(E e)
boolean remove(E e)
E remove(int index)

E set(int index,E e)

E get(int index)
int size()
 */

import java.util.ArrayList;

public class BaseSetJT {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        boolean s = list.add("Ab");
        list.add("A");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        System.out.println(s);
        System.out.println(list);

/*        boolean re = list.remove("A");
        System.out.println(list);

        String str = list.remove(0);
        System.out.println(str);
        System.out.println(list);*/

/*        String res = list.set(0, "AAA");
        String res2 = list.set(1, "BBB");
        System.out.println(res);
        System.out.println(res2);
        System.out.println(list);*/

/*        String g = list.get(3);
        System.out.println(g);
        System.out.println(list);*/


        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {

            String gg = list.get(i);
            System.out.println(gg);

        }



    }
}

