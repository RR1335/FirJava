package io.baijing.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DecryptFilesRun {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/ann/DJava/testfile/test/encry.txt");
        FileOutputStream fos = new FileOutputStream("/Users/ann/DJava/testfile/test/d.txt");

        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len ^ 10);
        }

        fos.close();
        fis.close();

    }
}
