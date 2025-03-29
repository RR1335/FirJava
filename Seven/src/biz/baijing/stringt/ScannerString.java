package biz.baijing.stringt;

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // next() 是 new 的字符串
        System.out.println("请输入字符串 abc ");
        // 参考如下的 next 核心代码，  return new String
        String s1 = sc.next();

        System.out.println(" ---------- S -----------");
        System.out.println(s1);

        String s2 = "abc";
        System.out.println("s1 == s2 -" + (s1 == s2));

        boolean b = s1.equals(s2);
        System.out.println("s1 == s2 -" + b);
    }
}


/*
    public static String newString(byte[] val, int index, int len) {
        if (len == 0) {
            return "";
        }
        if (String.COMPACT_STRINGS) {
            byte[] buf = compress(val, index, len);
            if (buf != null) {
                return new String(buf, LATIN1);
            }
        }
        int last = index + len;
        // new 的 next
        return new String(Arrays.copyOfRange(val, index << 1, last << 1), UTF16);
    }
 */