package biz.baijing.stringt;

public class StringJT {
    public static void main(String[] args) {

        // 空字符串
        String s1 = new String();
        System.out.println("-"+s1+"-");    // ""

        String s2 = new String("如月如花");
        System.out.println("-"+s2+"-");

        // 字符串是不能发生改变的
        // 字符串编程字符数组，变更数组的内容，拼接新的字符串
        char[] c1 = {'a', 'b', 'c'};
        String s3 = new String(c1);
        System.out.println("-"+s3+"-");
        c1[1]  = 'Q';
        String s4 = new String(c1);
        System.out.println("-"+s4+"-");

        // 网络传输中，做传输内容的转化
        byte[] b1 = {1,2,3,4,5,6,7};      // 通过 asc码表查了对应数据，再转化成字符
        String s5 = new String(b1);
        System.out.println("-"+s5+"-");
        byte[] b2 = {97,98,99,100};
        String s6 = new String(b2);
        System.out.println("-"+s6+"-");


    }
}
