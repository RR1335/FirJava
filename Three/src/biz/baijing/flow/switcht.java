package biz.baijing.flow;

import java.util.Scanner;

public class switcht {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字： ");
        int res = sc.nextInt();

        // res 的类型 byte short char int , JDK 17 枚举Enum 和 字符串String
        switch(res) {
            // case 后面的 value 是一个固定的值，不能是变量
            // 自变量
//            case 100:
//                System.out.println("100");
//                // break 必须有，是结束 switch 的标志
//                break;
//            case 200:
//                System.out.println("200");
//                break;
//
//            default:
//                System.out.println("default");
//                break;
            case 1 -> {
                System.out.println("1 ->");
            }
            case 2 -> {
                System.out.println("2 ->");
            }
            default -> {
                System.out.println("default ->");
            }

        }
    }
}
