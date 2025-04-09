package methodreference.baijing.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class RunStaticMethodRef {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        Collections.addAll(l,"1","2","3","4","5","6","7","8","9");


        l.stream().map(new Function<String,Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(System.out::println);


        // 方法引用
        l.stream().map(Integer::parseInt).forEach(System.out::println);






    }
}
