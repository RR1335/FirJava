package biz.baijing.playgame;

import java.util.Scanner;

public class StringRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字符串： ");
        String str = sc.nextLine();

        String result = rotate(str);
        System.out.println(result);

    }

    public static String rotate(String str) {
        String result = "";
        for (int i = str.length() - 1 ; i >= 0 ; i--) {
            char ch = str.charAt(i);
            result += ch;
        }

        return result;
    }

}
