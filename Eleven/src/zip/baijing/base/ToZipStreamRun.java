package zip.baijing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ToZipStreamRun {
    public static void main(String[] args) throws IOException {

        File src = new File("/Users/ann/DJava/testfile/test/1/d.txt");

        File dest = new File("/Users/ann/DJava/testfile/test/1/");

        toZip(src,dest);

    }

    public static void toZip(File src , File dest) throws IOException {

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));

        ZipEntry ze = new ZipEntry("a.txt");
        // AA/BCB/a.txt 代表压缩包中的 文件路径
//        ZipEntry ze1 = new ZipEntry("AA/BCB/a.txt");
        zos.putNextEntry(ze);

        FileInputStream fis = new FileInputStream(src);
        int len;
        while ((len = fis.read()) != -1) {
            zos.write(len);
        }

        zos.closeEntry();
        zos.close();

    }


}
