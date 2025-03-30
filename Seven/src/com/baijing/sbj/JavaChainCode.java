package com.baijing.sbj;

import java.util.Scanner;

public class JavaChainCode {
    public static void main(String[] args) {
        // 链式编程
        // 调用方法时，不需要用变量接受它的结果，可以继续调用其它方法

        int len = getString().substring(1).replace("A","IO").length();
        System.out.println(len);
    }

    public  static  String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串： ");
        String str = sc.nextLine();
        return str;
    }
}
