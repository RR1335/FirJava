package methodreference.baijing.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class RunMethodRefNew {
    public static void main(String[] args) {

        ArrayList<String> ls = new ArrayList<>();
        Collections.addAll(ls,"武士道,19","英雄泪,20","武家坡,22","地毯式,19","梁家辉,19","武松,30");

        ls.stream().map(new Function<String,Student>() {
            @Override
            public Student apply(String s) {
                String[] stuarr = s.split(",");
                String name = stuarr[0];
                int age = Integer.parseInt(stuarr[1]);
                return new Student(name, age);
            }
        }).toList().forEach(System.out::println);

        // 引用构造方法
        ls.stream().map(Student::new).toList().forEach(System.out::println);


    }
}
