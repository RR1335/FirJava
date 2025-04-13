package ioimprove.baijing.buffered;

import java.io.*;

public class BufferedStreamMuteByteRun {
    public static void main(String[] args) throws IOException {

        String INFOLDER = "/Users/ann/DJava/testfile/test/a.txt";
        String OUTFOLDER = "/Users/ann/DJava/testfile/test/d.txt";

        FileInputStream fis = new FileInputStream(INFOLDER);
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream(OUTFOLDER);
        BufferedOutputStream bos  = new BufferedOutputStream(fos);

        byte[] buf = new byte[1024];
        int len;

        while((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
        }

        bis.close();
        bos.close();

    }
}
