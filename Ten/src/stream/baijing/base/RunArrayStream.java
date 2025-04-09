package stream.baijing.base;

import java.util.Arrays;
import java.util.stream.Stream;

public class RunArrayStream {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        Arrays.stream(arr).forEach(System.out::println);

        String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l","m"};

        Arrays.stream(str).forEach(System.out::println);

        Arrays.stream(str,3,8).forEach(System.out::println);

        Stream.of(1,2,3,4,5,6,7,8,9).forEach(System.out::println);

    }
}
