package ioimprove.baijing.buffered;

import java.io.*;

public class BufferedStreamCopyFileRun {
    public static void main(String[] args) throws IOException {

        String INFOLDER = "/Users/ann/DJava/testfile/test/a.txt";
        String OUTFOLDER = "/Users/ann/DJava/testfile/test/d.txt";

        FileInputStream fis = new FileInputStream(INFOLDER);
        BufferedInputStream bis = new BufferedInputStream(fis);
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(INFOLDER));

        FileOutputStream fos = new FileOutputStream(OUTFOLDER);
        BufferedOutputStream bos  = new BufferedOutputStream(fos);

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        // FileInputStream and FileOutputStream 不需要 close
        bis.close();
        bos.close();


    }
}
