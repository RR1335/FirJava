package biz.goods.basej.goods;

import java.util.Scanner;

public class KeyBoardClass {
    public static void main(String[] args) {
        Goods[] g = new Goods[3];

        Scanner sc = new Scanner(System.in);
        // nextInt() 整数，nextDouble 带小数，next() 接字符 —— 空格 回车结束
        // nextLine() 接收字符串

//        Goods gg = new Goods();

        for (int i = 0; i < g.length; i++) {
            Goods gg = new Goods();

            System.out.println("请输入 id： ");
            String id = sc.next();
            // g[i].setId(id) , 提示： g[i] 是 null
            gg.setId(id);
            System.out.println("请输入 name： ");
            String name = sc.next();
            gg.setName(name);
            System.out.println("请输入 price： ");
            double price = sc.nextDouble();
            gg.setPrice(price);
            System.out.println("请输入 count： ");
            int count = sc.nextInt();
            gg.setCount(count);

            g[i] = gg;
            System.out.println("\t " + g[i].getName() + "\t " + g[i].getPrice() + "\t " + g[i].getCount() + "\t " + g[i].getId());
        }

        System.out.println(" ----------------------- ");

        for (int i = 0; i < g.length; i++) {
//            System.out.println(g[i]);    // 确认（验证） new Goods()在 for 循环外， g[i] 是否指向最后一次赋值的内存地址
            Goods gp = g[i];
            System.out.println("\t " + gp.getName() + "\t " + gp.getPrice() + "\t " + gp.getCount() + "\t " + gp.getId());
        }
    }
}
