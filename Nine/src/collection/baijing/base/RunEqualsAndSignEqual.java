package collection.baijing.base;

import java.util.Objects;

public class RunEqualsAndSignEqual {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

//        String x = "string";
//        String y = "string";
//        String z = new String("string");
//        System.out.println(x==y); // true
//        System.out.println(x==z); // false
//        System.out.println(x.equals(y)); // true
//        System.out.println(x.equals(z)); // true
//
//        System.out.println("x -" + System.identityHashCode(x));
//        System.out.println("y -" + System.identityHashCode(y));
//
//        System.out.println("z -" + System.identityHashCode(z));
//
//        String s = new String("string");
//        System.out.println("s -" + System.identityHashCode(s));
//        System.out.println(s.equals(z));

        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;


        System.out.println(arr[0] == arr2[0]);
        System.out.println(arr[0] == arr2[3]);
        System.out.println(System.identityHashCode(arr));
        System.out.println(System.identityHashCode(arr2));
        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(System.identityHashCode(arr2[0]));

        System.out.println(System.identityHashCode(arr2[3]));

        System.out.println(arr.equals(arr2));
        System.out.println(arr2.equals(arr));

        System.out.println(Objects.equals(arr[0], arr2[0]));

    }
}
