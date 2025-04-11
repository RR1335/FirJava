package file.baijing.exercise;

import java.io.File;

public class RunFindAllPathAndTXT {
    public static void main(String[] args) {

            File f = new File("/Users/bin"); // 激活 if 判断
//            File f = new File("/Users/ann/DJava/testfile"); // 返回有结果的数据
            findAllPathAndTXT(f);
    }

    public static void findAllPathAndTXT(File pathorfile ) {
        File[] files = pathorfile.listFiles();
        // pathorfile 为空 或者 无权限（null）
        if(files==null || files.length==0){
            System.out.println("目录为空，或无权限");
            return ;
        }
        for (File file : files) {
            if (file.isFile()) {
                // String filename = file.gerName();
                if (file.getName().endsWith(".java")) {
                    System.out.println(file.getName());
                }
            } else {

                findAllPathAndTXT(file);
            }
        }

    }

}
