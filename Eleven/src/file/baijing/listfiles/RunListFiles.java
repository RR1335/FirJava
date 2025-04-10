package file.baijing.listfiles;

import java.io.File;
import java.io.IOException;

public class RunListFiles {
    public static void main(String[] args) throws IOException {

        File f = new File("/Users/bin");
        // 获取隐藏文件和目录
        // 获取所有文件和目录列表
        // 不会获取子类目录或文件的内容
        // t2/t3 , t3 不存在 because "<local3>" is null
        // t2/c1.txt , c1.txt 是文件 返回 Cannot read the array length because "<local3>" is null
        // testfile/t1 t1 目录为空，返回一个长度为 0 的数组
        // 需要一个有权限才能访问的 目录时，返回 null ， "/Users/bin" 需要权限才能访问 Cannot read the array length because "<local3>" is null
        File[] files = f.listFiles();
//        System.out.println(files.length);   // 检测 testfile/t1
        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}
