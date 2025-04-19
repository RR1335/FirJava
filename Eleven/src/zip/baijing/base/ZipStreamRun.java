package zip.baijing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamRun {
    public static void main(String[] args) throws IOException {

        File src = new File("/Users/ann/DJava/testfile/test/1/j.zip");

        File dest = new File("/Users/ann/DJava/testfile/test/1/");

        unzip(src,dest);

    }

    public static void unzip(File src,File dest) throws IOException {

        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));

        ZipEntry ze ;
        while ((ze = zis.getNextEntry()) != null) {
            if (ze.isDirectory()) {
//                File  dir = new File(dest,ze.getName());
                File dir = new File(dest, ze.toString());
                dir.mkdirs();
            }else {
                FileOutputStream fos = new FileOutputStream(new File(dest, ze.toString()) );
                int len;
                while((len = zis.read()) != -1) {
                    fos.write(len);
                }
                fos.close();
                zis.closeEntry();
            }

        }
        zis.close();
    }

}
