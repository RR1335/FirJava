package io.baijing.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UpdateTryCatchRun {
    public static void main(String[] args) throws IOException {

        // 变量初始化 ， null
//        FileOutputStream fos = null;
//        FileInputStream fis = null;

        FileInputStream fis = new FileInputStream("/Users/ann/DJava/testfile/test/a.txt");
        FileOutputStream fos = new FileOutputStream("/Users/ann/DJava/testfile/test/d.txt");

        // JDK 9 之后
        try (fis ; fos){

            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
