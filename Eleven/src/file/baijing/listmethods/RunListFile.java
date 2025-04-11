package file.baijing.listmethods;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class RunListFile {
    public static void main(String[] args) throws IOException {

        File f = new File("/Users/ann/DJava/testfile/t2");

        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                boolean b = pathname.isFile() && pathname.getName().endsWith(".txt"); // 和 return 可以合并
                // return true 直接返回所有文件 list
                return b ;
            }
        });

        System.out.println(Arrays.toString(files));

        File[] files1 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File f = new File(dir, name);
                boolean b = f.isFile() && f.getName().endsWith(".txt");
                return b;
            }
        });

        System.out.println(Arrays.toString(files1));

    }
}
