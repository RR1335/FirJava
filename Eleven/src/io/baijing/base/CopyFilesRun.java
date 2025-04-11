package io.baijing.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFilesRun {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/ann/DJava/testfile/test/a.txt");
        FileOutputStream fos = new FileOutputStream("/Users/ann/DJava/testfile/test/d.txt");

        int bis ;
        while((bis = fis.read()) != -1) {
            fos.write(bis);
        }

        // 统计拷贝时间，通过文件修改时间 lastModified 减即可

        fos.close();
        fis.close();

    }
}
