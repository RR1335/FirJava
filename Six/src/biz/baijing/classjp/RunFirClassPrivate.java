package biz.baijing.classjp;

import java.util.Scanner;

public class RunFirClassPrivate {
    public static void main(String[] args) {
        FirClassPrivate fp = new FirClassPrivate();

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
//        int age = fp.setAge(x);
        fp.setAge(x);
        int age = fp.getAge();

        System.out.println(age);
    }
}
