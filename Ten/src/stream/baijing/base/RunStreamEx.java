package stream.baijing.base;

import java.util.ArrayList;
import java.util.Collections;

public class RunStreamEx {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        Collections.addAll(l,"a","b","bsd");

/*        Stream<String> str = l.stream();
        str.forEach(System.out::println); // :: 是 Consumer 的一种表达方式，能点进去查看*/


/*        Stream<String> str = l.stream();
        str.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

//        l.stream().forEach(s -> System.out.println(s));

        l.stream().forEach(System.out::println);

    }
}
