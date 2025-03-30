package com.baijing.sbj;

import java.util.StringJoiner;

public class StringJoinerT {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","{","}");

        String str = sj.add("1").add("2").toString();
        System.out.println(sj.getClass());
        System.out.println(str);
        System.out.println(str.getClass());

        int len = sj.length();
        System.out.println(len);

    }
}
