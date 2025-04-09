package methodreference.baijing.base;

import java.util.Arrays;
import java.util.Comparator;

public class RunMethodRef {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        // 匿名内部类


        Arrays.sort(arr,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println(Arrays.toString(arr));

        // lambda 表达式

        Arrays.sort(arr,(o1,o2) -> o2-o1);

        System.out.println(Arrays.toString(arr));

        // 方法引用
        // 方法引用符号  ::

        Arrays.sort(arr,RunMethodRef::subtraction);

        System.out.println(Arrays.toString(arr));

    }

    public static int subtraction(int a, int b) {
//        return b - a;
        return a - b ;
    }



}
