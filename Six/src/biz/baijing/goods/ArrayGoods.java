package biz.baijing.goods;

public class ArrayGoods {
    public static void main(String[] args) {
        // 对象数组
        Goods[] g = new Goods[3];
        Goods gg = new Goods();
        // 创建商品对象
        Goods g1 = new Goods("001","相机",3999.00,200);
        Goods g2 = new Goods("002","帆布包",29.000,1000);
        Goods g3 = new Goods("003","台灯",299.00,5000);

        // 赋值
//        g[0] = g1;
        gg.setId("001");
        gg.setName("相机");
        gg.setPrice(3999.00);
        gg.setCount(200);

        g[0] = gg;
        g[1] = g2;
        g[2] = g3;

        // 打印输出
        for (int i = 0; i < g.length ; i++) {
            System.out.println("\t " + g[i].getName() + "\t " + g[i].getPrice() + "\t " + g[i].getCount() + "\t " + g[i].getId());
        }

    }
}


/*
System.out.println(g[i]);
输出 数组的内存地址
biz.baijing.goods.Goods@36baf30c
biz.baijing.goods.Goods@7a81197d
biz.baijing.goods.Goods@5ca881b5
*/