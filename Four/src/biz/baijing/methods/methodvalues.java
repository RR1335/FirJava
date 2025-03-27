package biz.baijing.methods;

import java.util.Scanner;

public class methodvalues {
    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            int i3 = sc.nextInt();

           sum = getSum(i1,i2,i3) + sum;

        }
        System.out.println(sum);

    }

    public static int getSum(int a, int b, int c) {
        int gs = a + b + c;
        return gs;
    }
}
