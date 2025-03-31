package com.baijing.sbj;

public class StringBuilderSwell {
    public static void main(String[] args) {
        StringBuilder sj = new StringBuilder();

        System.out.println(sj.capacity());
        System.out.println(sj.length());

        sj.append("2dsafjjlk");

        System.out.println(sj.capacity());
        System.out.println(sj.length());

        sj.append("3aregialjvlajgljgraksfj");
        System.out.println(sj.capacity());
        System.out.println(sj.length());

        sj.append("4ds;jalkasdkfjjlkdsajflerjfiouergnkjvndfkjvdfnkdgj");
        System.out.println(sj.capacity());
        System.out.println(sj.length());
    }
}
