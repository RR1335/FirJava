package file.baijing.listmethods;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class RunListMethod {
    public static void main(String[] args) throws IOException {

        // windows 系统就是展示所有盘符，macOS 展示所有的盘根目录
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));

        File f = new File("/Users/ann/DJava/testfile/t2");
        // 只会获取名字
//        String[] list = f.list();
//        for (String s : list) {
//            System.out.println(s);
//        }

        String[] list1 = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
/*                //返回值： [.DS_Store, test, c1.txt, c2.txt, tt1]
                return true;*/

                File fl = new File(dir, name);
                // 依次打印 name 的绝对路径
//                System.out.println(fl);
//                return true;

                return fl.getName().endsWith(".txt");
//                return fl.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(list1));


    }
}
