package io.baijing.base;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteFileInputStreamRun {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("");
        try {
            fis = new FileInputStream("/Users/ann/DJava/testfile/test/c.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 读取结束，返回 -1
        int bycontent = fis.read();

        System.out.println((char) bycontent);

        fis.close();

    }
}
