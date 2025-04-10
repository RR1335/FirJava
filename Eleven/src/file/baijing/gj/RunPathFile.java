package file.baijing.gj;

import java.io.File;

public class RunPathFile {
    public static void main(String[] args) {

        // File 的判定
        File f = new File("/Users/ann/DJava/testfile/a.txt");
        System.out.println("a.txt -" + f.isDirectory());
        System.out.println("a.txt -" + f.isFile());
        System.out.println("a.txt -" + f.exists());


        // path 的判定
        File f1 = new File("/Users/ann/DJava/testfile");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        File f2 = new File("/Users/ann/DJava/test");
        System.out.println("test -" + f2.isDirectory());
        System.out.println("test -" + f2.isFile());
        System.out.println("test -" + f2.exists());



    }
}
