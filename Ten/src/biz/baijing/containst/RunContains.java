package biz.baijing.containst;

import java.util.*;

public class RunContains {
    public static void main(String[] args) {

        // 定义数组，定义景点

        String[] place = {"A","B","C","D"};

        ArrayList<String> list = new ArrayList<String>();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(place.length);
            list.add(place[index]);
//            System.out.print(index + " ");
        }

        HashMap<String,Integer> hm = new HashMap<>();

        for (String pn : list) {
            if (hm.containsKey(pn)) {
                int count = hm.get(pn);
                count++;
                hm.put(pn,count);
            } else {
                hm.put(pn,1);
            }
        }

        System.out.println(hm);

        int max = 0 ;
        Set<Map.Entry<String,Integer>> ps = hm.entrySet();
        for (Map.Entry<String,Integer> entry : ps) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }
        System.out.println("MAX :" + max);

        for (Map.Entry<String,Integer> entry : ps) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println("最热景点 ：" + entry.getKey());
            }
        }


    }
}
