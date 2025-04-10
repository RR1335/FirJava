package file.baijing.base;

import java.io.File;

public class RunFile {
    public static void main(String[] args) {

        // macOS 的路径和 Windows 的路径差异不同
        String strpath = "/Users/ann/DJava/testfile";
        String filename = "t.txt";

        File f = new File(strpath + "/" + filename);

        System.out.println(f);

        File path = new File("/Users/ann/DJava/testfile");
        String filename2 = "t.txt";
//        File f2 = new File(strpath + "/" + filename2);
        File f2 = new File(path,filename2);
        System.out.println(f2);


    }
}
