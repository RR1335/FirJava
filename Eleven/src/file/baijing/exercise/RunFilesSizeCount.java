package file.baijing.exercise;

import java.io.File;

public class RunFilesSizeCount {
    public static void main(String[] args) {

        File file = new File("/Users/ann/DJava/testfile/test");
        System.out.println(filesSizeCount(file));

    }

    public static long filesSizeCount(File file) {
        // File.java 中 public long length() { 被定义成了 long
        long size = 0;

        File[] files = file.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("目录为空 ！！！");
            return size;
        }

        for (File f : files) {
            if (f.isFile()) {
                size += f.length();
            } else {

                size = size + filesSizeCount(f);
            }
        }

        return size;
//        return size / 1024 / 1024 ; // kb mb
    }
}
