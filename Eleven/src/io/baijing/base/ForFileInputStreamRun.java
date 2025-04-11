package io.baijing.base;

import java.io.FileInputStream;
import java.io.IOException;

public class ForFileInputStreamRun {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/ann/DJava/testfile/test/a.txt");

        int bis ;
        while((bis = fis.read()) != -1) {
            // 回车 ASCII 13 ，'\x0d'
            // 换行 10
            // 空格 32
            if (bis == 13) {
                System.out.print("\n");
            }
            System.out.print((char)bis);
        }

        fis.close();

    }
}
