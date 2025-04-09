package stream.baijing.base;

import java.util.HashMap;

public class RunSteamEx01 {
    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("学生会",001);
        hm.put("大家长",002);
        hm.put("夜夜笙歌",003);
        hm.put("住酒店",004);

        System.out.println(hm);

        hm.keySet().stream().forEach(System.out::println);

        hm.values().stream().forEach(System.out::println);

        hm.entrySet().stream().forEach(System.out::println);

    }
}
