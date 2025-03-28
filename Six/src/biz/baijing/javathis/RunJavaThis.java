package biz.baijing.javathis;

import java.util.Scanner;

public class RunJavaThis {
    public static void main(String[] args) {
        JavaThis fp = new JavaThis();

        fp.setName("如花似玉");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
//        int age = fp.setAge(x);
        fp.setAge(x);
        int age = fp.getAge();

        System.out.println(fp.getName());
        System.out.println(age);
    }
}
