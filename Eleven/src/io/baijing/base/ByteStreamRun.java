package io.baijing.base;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamRun {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("/Users/ann/DJava/testfile/test/a.txt");

        // 输出 写入数据
        fos.write(90); // ASCII 码
        // 关闭
        fos.close();

    }
}
