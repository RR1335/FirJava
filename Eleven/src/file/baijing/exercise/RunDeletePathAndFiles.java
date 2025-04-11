package file.baijing.exercise;

import java.io.File;

public class RunDeletePathAndFiles {
    public static void main(String[] args) {

        File f = new File("/Users/ann/DJava/testfile/test");
        deletePathAndTXT(f);

    }

    public static void deletePathAndTXT(File file) {
        File[] files = file.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("当前目录不存在 ！！！");
            return;
        }
        for (File f : files) {
            if (f.isFile()) {
                f.delete();
            } else {
                deletePathAndTXT(f);
            }
        }
        // 最后删除当前要删除的目录
        file.delete();
    }

}
