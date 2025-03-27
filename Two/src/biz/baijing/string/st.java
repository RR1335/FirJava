package biz.baijing.string;

public class st {
    public static void main(String[] args) {

        System.out.println( '中'+"bajing.biz"+false);

        int age = 20;
        System.out.println("年龄"+ age + "岁");

        // 从左到右依次计算的， 11baijing.biz101
        System.out.println(1+10+"baijing.biz"+10+1);

        char cc = 'a';
        int  res = cc + 0;
        // res = 97 , cc 通过 asc表提取 a 的表内数字
        System.out.println(res);

        int aa = 123;
        System.out.println(aa % 10);
        System.out.println(aa / 10 % 10) ;
        System.out.println(aa / 100 % 10);

    }
}
