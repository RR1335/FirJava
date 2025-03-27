package biz.baijing.flow;

import java.util.Scanner;

public class flow  {
    public static void main(String[] args) {
        int a = 10;
        if ( a > 10 ) {
            System.out.println("Enjoy");
        }
        if ( a <= 10 ) {
            System.out.println("False");
        }

        // Boolean 类型，直接在 条件中写入
        if (true) {
            System.out.println("True");
        }

        if ( a > 10 ) {
            System.out.println("Enjoy");
        } else  {
            System.out.println("else - False");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println(" 请输入任意数： ");
        int res = sc.nextInt();

        if ( res >= 90 ) {
            System.out.println("Enjoy");
        } else if (  res >= 70 ) {
                System.out.println("Normal");
        } else if ( res >= 50 ) {
            System.out.println("False");
        }else {
            System.out.println(" No ");
        }
    }
}
