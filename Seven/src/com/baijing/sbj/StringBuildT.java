package com.baijing.sbj;

public class StringBuildT {
    public static void main(String[] args) {
        // StringBuilder 创建的是容器，其内容可变
        StringBuilder sb = new StringBuilder();

        sb.append(1);
        sb.append(2.5);
        sb.append(true);

        sb.append(3.14).append("JSDOIJnfre;ir").append(1902988).append(true)

        StringBuilder reverse = sb.reverse();

        int len = sb.length();

        System.out.println(len);

        System.out.println(sb);

        // object.getClass() 返回 Object 的 java 类
        System.out.println("StringBuilder sb = new StringBuilder(); : "  + sb.getClass());

        String str = sb.toString();

        System.out.println("String str = sb.toString();" + str);
        System.out.println("str: " + str.getClass());


    }
}
