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

    }
}
