package ai.baijing.interfaceexp;

import java.util.Scanner;

public class RunInter {
    public static void main(String[] args) {

        InterClass ic = new InterClass();

        System.out.println(ic.a);

        ic.interMethod();

        // 为了方便查看内存
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

    }
}
