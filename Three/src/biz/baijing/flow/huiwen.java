package biz.baijing.flow;

import java.util.Scanner;

public class huiwen {
    public static void main(String[] args) {

        // 回文数字
        Scanner sc = new Scanner(System.in);
        System.out.println("输入： ");
        int res = sc.nextInt();
        int resnum = res;

        int num = 0;

        while (res != 0) {
            int res1 = res % 10;
            res /= 10;
            num = num * 10 + res1;
        }

        System.out.println(num);
        System.out.println(res);
        System.out.println(resnum == num);
    }
}
