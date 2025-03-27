package biz.baijing.flow;

import java.util.Scanner;

public class whilet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input: ");
        int res = sc.nextInt();
        System.out.println("output: ");
        int i = sc.nextInt();


        while (res >= i ) {
            System.out.println("F" + i);
            i++;
        }
    }
}
