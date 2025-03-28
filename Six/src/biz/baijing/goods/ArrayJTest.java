package biz.baijing.goods;

public class ArrayJTest    {
    public static void main(String[] args) {
        Goods g = new Goods();

        Goods[] gs = new Goods[3];

        System.out.println(g);

        Goods g1 = new Goods("001","相机",3999.00,200);
        Goods g2 = new Goods("002","帆布包",29.000,1000);
        Goods g3 = new Goods("003","台灯",299.00,5000);

        System.out.println("数组的 g[i] 赋值前： ");
        for (int i = 0; i < gs.length; i++) {
            System.out.println(gs[i]);
        }

        // 问题 为何 g[i].setPrice(399.00) 报错。

        gs[0] = g1;
        gs[1] = g2;
        gs[2] = g3;


        System.out.println("数组的 g[i] 赋值后 ： ");
        for (int i = 0; i < gs.length; i++) {
            System.out.println(gs[i]);
        }

    }
}
