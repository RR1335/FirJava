package io.baijing.charactorset;

import java.io.FileReader;
import java.io.IOException;

public class CharactorSetRun {
    public static void main(String[] args) throws IOException {

        // 根据不同的 字符集 ，读取规则不同 已经定义
        FileReader fr = new FileReader("/Users/ann/DJava/testfile/test/a.txt");

        /*
        * 字符流会在内存创建 缓冲区， 8192的字节 —— utf-8
        *
        * */

        int ch;
        while((ch = fr.read()) != -1) {
            System.out.print((char)ch);
            // read() 按照字节读取，解码专程10进制返回，这是每个汉字对应的字符集编码
//            System.out.print(ch);
        }


        fr.close();


    }
}
