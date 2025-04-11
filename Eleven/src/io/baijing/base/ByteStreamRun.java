package io.baijing.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamRun {
    public static void main(String[] args) throws IOException {

        // 参数： File 对象 或者 String
        // 目录必须存在，不会创建目录；文件不存在会创建文件
//        FileOutputStream fos = new FileOutputStream("/Users/ann/DJava/testfile/test/a.txt");

        File f = new File("/Users/ann/DJava/testfile/test/b.txt");
        FileOutputStream fos = new FileOutputStream(f);

        // 输出 写入数据
        // 覆盖，而非追加
        fos.write(90); // ASCII 码
        // 关闭
        fos.close();

    }
}
