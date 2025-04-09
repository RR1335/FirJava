package methodreference.baijing.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class RunMemberMethod {
    public static void main(String[] args) {

        ArrayList<String> ls = new ArrayList<>();
        Collections.addAll(ls,"武士道","英雄泪","武家坡","地毯式","梁家辉","武松");

        ls.stream().filter( str -> str.startsWith("武")).filter(s -> s.length() == 3).forEach(System.out::println);

        ls.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 3 && s.startsWith("武");
            }
        }).forEach(System.out::println);

        ls.stream().filter(new MemberMethodRef()::StringStartAndLength).forEach(System.out::println);

        MemberMethodRef mmf = new MemberMethodRef();
        ls.stream().filter(mmf::StringStartAndLength).forEach(System.out::println);


    }
}
