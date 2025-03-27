package biz.baijing.flow;

import java.util.Scanner;

public class flowt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int res = sc.nextInt();

        for (int i = 1;  i <= res; i++) {
            System.out.println("F" + i);
        }

    }
}
