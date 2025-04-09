package collections.baijing.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RunCollections {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        Collections.addAll(list,"dsaj","adsje","iwuer","90aufe","uodsuje");

        System.out.println(list);

        // 打乱
        Collections.shuffle(list);

        System.out.println(list);

        Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(list);

        Collections.sort(list,(o1,o2)->o2.compareTo(o1));

        System.out.println(list);


    }
}
