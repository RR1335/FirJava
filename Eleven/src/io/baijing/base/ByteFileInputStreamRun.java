package io.baijing.base;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteFileInputStreamRun {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/ann/DJava/testfile/test/a.txt");

        int bycontent = fis.read();

        System.out.println(bycontent);

        fis.close();

    }
}
