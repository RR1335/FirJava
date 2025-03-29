package biz.baijing.stringarray;

import java.util.Scanner;

public class StringArrayT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");

        String str = sc.nextLine();

        System.out.println(str + " 内存地址 -" + System.identityHashCode(str));
        System.out.println(str + " 字符打印如下 -");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
            System.out.println(ch + " 字符的内存地址 -" +System.identityHashCode(ch));
        }
    }
}
