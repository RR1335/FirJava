package biz.baijing.methodmemory;

public class methodparams {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);

        getNum(a);

        System.out.println(a);

    }

    public static void getNum(int aa) {
        aa = 500;
    }

    public static void getNum2(int a) {
        a = 500;
    }
}
