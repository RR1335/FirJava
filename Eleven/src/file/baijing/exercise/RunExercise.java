package file.baijing.exercise;

import java.io.File;
import java.io.IOException;

public class RunExercise {
    public static void main(String[] args) throws IOException {

        File f = new File("/Users/ann/DJava/testfile/test");

        f.mkdirs();

//        boolean mkdirs = new File("/Users/ann/DJava/testfile/test").mkdirs();
        File file = new File(f,"a1.doc");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);

//        new File("/Users/ann/DJava/testfile/test/a.txt").createNewFile();

//        boolean newFile = false;
//        try {
//            File file = new File( "a.txt"); // 并没有抛出异常
//            newFile = file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(newFile);




    }
}
