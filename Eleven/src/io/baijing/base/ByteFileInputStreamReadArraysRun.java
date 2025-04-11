package io.baijing.base;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteFileInputStreamReadArraysRun {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/ann/DJava/testfile/test/a.txt");

//        int bis ;
//        while((bis = fis.read()) != -1) {
//            fos.write(bis);
//        }

        byte[] b = new byte[5];
        // 返回读取了多少个数据，小于等于 5
        int len = fis.read(b);
//        String str = new String(b);
//        System.out.println(str);

        // 读不到数据返回 -1
        while ( len != -1) {
            String str1 = new String(b, 0, len);
            System.out.println(str1);
            len = fis.read(b);
        }


        fis.close();



    }
}
