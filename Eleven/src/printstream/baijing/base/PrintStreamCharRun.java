package printstream.baijing.base;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamCharRun {
    public static void main(String[] args) throws IOException {

        String FOLDER = "/Users/ann/DJava/testfile/test/n2.txt";
        // 有缓存，字符打印流需要默认打开刷新
        FileWriter fw = new FileWriter(FOLDER);
        PrintWriter pw = new PrintWriter(fw, true);

        pw.println("如何发现一天中的美好生活。");

        pw.close();


    }
}
