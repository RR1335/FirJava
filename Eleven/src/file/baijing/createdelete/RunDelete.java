package file.baijing.createdelete;

import java.io.File;
import java.io.IOException;

public class RunDelete {
    public static void main(String[] args) throws IOException {

//        File f = new File("/Users/ann/DJava/testfile/a.txt");
//        // 直接删除，不会过废纸篓
//        boolean de = f.delete();
//        System.out.println(de);

//        File f1 = new File("/Users/ann/DJava/testfile/t1");
//        // 删除了 目录 t1
//        boolean de1 = f1.delete();
//        System.out.println(de1);

        File f2 = new File("/Users/ann/DJava/testfile/t2");
        // t2/tt1 这是已经存在的目录结构
        // 返回 false ， delete 只能删除没有“内容”的空文件夹
        boolean delete = f2.delete();
        System.out.println(delete);


    }
}
