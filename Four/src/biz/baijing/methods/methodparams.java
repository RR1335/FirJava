package biz.baijing.methods;

import java.util.Scanner;

public class methodparams {
    public static void main(String[] args) {
        // 带参数的 方法 定义，调用
        getSum(10 , 20);

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        getSum(a, b);

    }

    public static void getSum(int num1 , int num2) {
        int res = num1 + num2;
        System.out.println(res);
    }


}
