package commonsio.baijing.fileutils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileUtilsRun {
    public static void main(String[] args) throws IOException {

/*        File src = new File("/Users/ann/DJava/testfile/test/a.txt");
        File dest = new File("/Users/ann/DJava/testfile/test/b.txt");*/

//        FileUtils.copyFile(src,dest);

        /*
        * *******************************
        * */

//        File src = new File("/Users/ann/DJava/testfile/test/1");
//        File dest = new File("/Users/ann/DJava/testfile/test/2");

        // 将 1 目录下的内容，复制到 2 目录下；结构： 2/...(和 1 目录下的内容一致)
//        FileUtils.copyDirectory(src, dest);
        // 将 1 整个目录，拷贝到 2 目录下；结构： 2/1/...(目录1下的内容)
//        FileUtils.copyDirectoryToDirectory(src, dest);

        /*
         * *******************************
         * */

        File deldirs = new File("/Users/ann/DJava/testfile/test/1");

//        FileUtils.deleteDirectory(deldirs);
        // 清空 1 目录下的内容， 1 目录保存
        FileUtils.cleanDirectory(deldirs);


//        static String readFileToString(File file, Charset encoding);  // 读取文件的数据，编程字符

//        static void write(File file, CharSequence data, String encoding); // 写出数据

    }
}
