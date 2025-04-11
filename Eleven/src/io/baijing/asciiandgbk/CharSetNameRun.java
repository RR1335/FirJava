package io.baijing.asciiandgbk;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CharSetNameRun {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "我ai世界";

        byte[] bytes = str.getBytes();                 // ideaj 默认编码： utf-8
        System.out.println(Arrays.toString(bytes));

        byte[] gbkbyte  = str.getBytes("GBK");
        System.out.println(Arrays.toString(gbkbyte));

        byte[] utf16 = str.getBytes(StandardCharsets.UTF_16);
        System.out.println(Arrays.toString(utf16));


        String strhan = new String(bytes);
        System.out.println(strhan);

        String strhan2 = new String(gbkbyte, "GBK");
        System.out.println(strhan2);

        String strhan3 = new String(utf16, StandardCharsets.UTF_16);
        System.out.println(strhan3);


    }
}
