package io.baijing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UpdateCopyFilesRun {
    public static void main(String[] args) throws IOException {

        File fo = new File("/Users/ann/DJava/testfile/test/d.txt");

        FileInputStream fis = new FileInputStream("/Users/ann/DJava/testfile/test/a.txt");
        FileOutputStream fos = new FileOutputStream(fo);

        long start = System.currentTimeMillis();

        long stime = fo.lastModified();

        byte[] buffer = new byte[5];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }



        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long etime = fo.lastModified();
        System.out.println(etime - stime);

        System.out.println("done");

    }
}
