package zip.baijing.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ToZipStreamOfFilesRun {
    public static void main(String[] args) throws IOException {

        File src = new File("/Users/ann/DJava/testfile/test/1");

        File destParent = src.getParentFile();

        File dest = new File(destParent,src.getName() + ".zip");

//        System.out.println(dest);

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        // src.getName() 是当前的目录名（ 即： 压缩后，压缩包内的路径）
        toZip(src,zos,src.getName());

        zos.close();
    }

    /*
    src : 数据源
    zos ： 压缩流
    name ： 压缩包，内部的路径
     */
    public static void toZip(File src, ZipOutputStream zos,String name) throws IOException {

        File[] files = src.listFiles();
        for (File file : files) {
            // file 是绝对路径
            if(file.isFile()) {
                ZipEntry ze = new ZipEntry(name + "/" + file.getName());
                zos.putNextEntry(ze);
                FileInputStream fis = new FileInputStream(file);
                int len;
                while((len = fis.read()) != -1) {
                    zos.write(len);
                }
                fis.close();
                // 当前文件关闭
                zos.closeEntry();
            }else {
                toZip(file, zos, name + "/" + file.getName());
            }
        }
    }


}
