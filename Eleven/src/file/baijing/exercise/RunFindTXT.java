package file.baijing.exercise;

import java.io.File;

public class RunFindTXT {
    public static void main(String[] args) {

        File file = new File("/Users/ann/DJava/testfile/test");
        boolean b = findTXT(file);
        System.out.println(b);
    }

    public static boolean findTXT(File path) {
        File[] files = path.listFiles();
        for (File file : files) {
           if (file.isFile() && file.getName().endsWith(".txt")){
                return true;
            }
        }
        // 这里不需要 if
        return false;
    }

}
