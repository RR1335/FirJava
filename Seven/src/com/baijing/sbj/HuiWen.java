package com.baijing.sbj;

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {

        String str = getString();

        // method chaining
        String result  = new StringBuilder().append(str).reverse().toString();
        System.out.println(result);

        if (str.equals(result)) {
            System.out.println(result + "是对称字符串");
        } else {
            System.out.println(result + "不是对称字符串");
        }
    }

    public  static  String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串： ");
        String str = sc.nextLine();
        return str;
    }
}
