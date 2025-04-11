package io.baijing.asciiandgbk;

import java.io.FileInputStream;
import java.io.IOException;

public class ChineseGBKRun {
    public static void main(String[] args) throws IOException {

        // a.txt 内容： 你好中国！
        FileInputStream fis = new FileInputStream("/Users/ann/DJava/testfile/test/a.txt");

        int b;
        while((b = fis.read()) != -1) {
            // 输出乱码
            System.out.print((char)b);
        }

        fis.close();


    }
}
