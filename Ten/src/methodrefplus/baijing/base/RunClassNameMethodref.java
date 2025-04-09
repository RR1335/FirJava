package methodrefplus.baijing.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class RunClassNameMethodref {
    public static void main(String[] args) {

        ArrayList<String> ls = new ArrayList<>();

        Collections.addAll(ls, "aaa", "sfd", "c", "ert", "dvdsv", "sdqw", "asdqq", "sf");

        ls.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);

        // 方法引用
        ls.stream().map(String::toUpperCase).forEach(System.out::println);


    }
}
