package io.baijing.example;

import java.io.*;

public class CopyFolderRun {
    public static void main(String[] args) throws IOException {

        File src = new File("/Users/ann/DJava/testfile/test");

        File des = new File("/Users/ann/DJava/testfile/T1");

        copyDir(src,des);

    }

    private static void copyDir(File src, File des) throws IOException {
        File[] files = src.listFiles();
        if (files == null || files.length == 0) {
            System.out.println(src.getAbsolutePath() + " 是空文件夹或需要权限访问，请检查后重试。");

            return;
        }

        // 如果 des 已存在，也不会报错；不存在直接创建
        des.mkdirs();

        for (File file : files) {
            if (file.isDirectory()) {
                copyDir(file, new File(des, file.getName()));
            } else {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(des,file.getName()));

                byte[] buf = new byte[1024];
                int len;

                while((len = fis.read(buf)) != -1)  {
                    fos.write(buf, 0, len);
                }

                fos.close();
                fis.close();
            }

        }


    }
}
