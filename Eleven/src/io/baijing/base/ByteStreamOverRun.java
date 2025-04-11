package io.baijing.base;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamOverRun {
    public static void main(String[] args) throws IOException {

        // FileOutputStream 目录 是否覆盖（追加）
        FileOutputStream fos = new FileOutputStream("/Users/ann/DJava/testfile/test/a.txt",true);

        String str = "SKDfjafnKHKLSHkhjrert";
        String str2 = "1283749873423";
        byte[] bytes = str.getBytes();
        byte[] bytes1 = str2.getBytes();
        fos.write(bytes);
        // windwos 换行符  \r\n
        // macOS 换行符 \r
        // Linux 换行符 \n
        String enter = "\r";
        fos.write(enter.getBytes());

        fos.write(bytes1);

        fos.close();

    }
}
