package biz.baijing.relx;

public class log {
    public static void main(String[] args) {

        System.out.println(" || ");
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);

        System.out.println(" && ");
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(true && true);

        int a = 10;
        int b = 20;

        boolean res = ++a < 5 && ++b >20;
        System.out.println("res");
        System.out.println(res);
        // a = 11
        System.out.println(a);
        // b = 20
        System.out.println(b);

        boolean res2 = ++a > 5 || ++b >20;
        System.out.println("res2");
        System.out.println(res2);
        // a = 12
        System.out.println(a);
        // b = 20
        System.out.println(b);

    }
}
