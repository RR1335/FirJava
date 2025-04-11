package io.baijing.base;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamArraysRun {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("/Users/ann/DJava/testfile/test/a.txt");

        byte[] buf = {90,89,77,91,56,57,70,72};
//        fos.write(buf);

        // write(byte[] , off , len ) off - index 第一个开始， len - 长度
        fos.write(buf,2,3);

        fos.close();


    }
}
