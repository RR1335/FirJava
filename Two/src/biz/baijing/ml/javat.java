package biz.baijing.ml;

public class javat {
    public static void main(String[] args) {
        int c = 8;
        double d = 10.1;

        float e = (float) (c + d);

        double g =  c + d;

        System.out.println(e);
        System.out.println(g);

        int a = 100;
        int b = 500;

        byte a1 = (byte) a;
        byte b1 = (byte) b;

        System.out.println(a1);
        // -12 , 强制转换类型可能导致计算错误
        System.out.println(b1);

        int bc = 10;
        int bcc = bc++ / 5;
        System.out.println(bcc);
        System.out.println(bc);

        int cbc = 10;
        int bcb = cbc++;
        System.out.println(cbc);
        System.out.println("bcb:"+bcb);

        float cb = 10;
        float ccb = ++cb / 5 ;
        System.out.println(ccb);
        System.out.println(cb);

        int bbc = 10;
        int cbb = ++bbc;
        System.out.println(cbb);
        System.out.println(bbc);

        int bb = 10;
        int eb = 5;
        eb += bb;
        System.out.println(eb);

        // += /= -= %= 默认进行了强制类型转换
        short i = 1;
        i += i + 1;
        System.out.println(i);

    }
}
