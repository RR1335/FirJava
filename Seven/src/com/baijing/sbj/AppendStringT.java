package com.baijing.sbj;

public class AppendStringT {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9} ;

        String str = arrToString(a);
        System.out.println(str);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        String str = sb.append("]").toString() ;

        return str;
    }
}
