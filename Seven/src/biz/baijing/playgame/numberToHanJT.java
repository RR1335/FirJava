package biz.baijing.playgame;

import java.util.Scanner;

public class numberToHanJT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money ;
        while (true){
            System.out.println("请输入整数金额：");
            money = sc.nextInt();
            if (money >= 0 && money < 9999999) {
                break;
            } else {
                System.out.println("输入金额无效");
            }
        }

        String moneyStr = "";
        // 取模，依次取 money 的个位数
        while (true){
            int numMod = getMod(money);
            // 拼接中文数字
            String hanStr = getHan(numMod);
            moneyStr = hanStr + moneyStr;

            money = money / 10;

            if ( money == 0) {
                break;
            }
        }

        int count = 7 - moneyStr.length();

        for (int i = 0; i < count; i++) {
            moneyStr = "零"  + moneyStr;
        }

        System.out.println(getHanUnit(moneyStr));

    }

    // 从右到左取数字的个位数，每次取一个数字
    public  static int getMod(int number) {
        return number % 10;
    }

    // 英文转换成中文大写
    public static String getHan(int number) {
        // 定义数组中文大写
        String[] strHan = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};

        return strHan[number];
    }

    // 拼接中文大写数字和数字单位
    public static  String  getHanUnit(String Str) {
        String[] hanStrUnit = {"佰","拾","万","仟","佰","拾","元"};

        String hanStr = "";
        int    strLen = Str.length();
        for (int i = 0; i < strLen; i++) {
            char ch = Str.charAt(i);
            hanStr = hanStr + ch + hanStrUnit[i];
        }

        return hanStr;
    }

}
