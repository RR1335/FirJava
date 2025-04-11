package io.baijing.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchFinallyRun {
    public static void main(String[] args) throws IOException {

        // 变量初始化 ， null
        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("/Users/ann/DJava/testfile/test/a.txt");
            fos = new FileOutputStream("/Users/ann/DJava/testfile/test/d.txt");

            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            assert fos != null;
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
