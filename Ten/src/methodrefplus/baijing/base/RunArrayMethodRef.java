package methodrefplus.baijing.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RunArrayMethodRef {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 数组的类型，和 stream 中的数据类型保持一致
        Integer[] arr = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));


    }
}
