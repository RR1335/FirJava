package biz.baijing.methods;

public class reload {
    public static void main(String[] args) {
        reLoad(12);
        reLoad2(12 , 10);
    }

    public static int reLoad(int n) {
        System.out.println(n);
        return n;
    }

    public static int reLoad2(int n,int m) {
        System.out.println(n +" " + m);
        return  n+m;
    }


}
