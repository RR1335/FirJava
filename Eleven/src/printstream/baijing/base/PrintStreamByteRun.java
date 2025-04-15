package printstream.baijing.base;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class PrintStreamByteRun {
    public static void main(String[] args) throws FileNotFoundException {

        String FOLDER = "/Users/ann/DJava/testfile/test/n1.txt";
        FileOutputStream fos = new FileOutputStream(FOLDER,true); // 追加
        PrintStream ps = new PrintStream(fos,true, UTF_8);

//        ps.write(102);
//        ps.println(102);
        ps.printf("Hello World! %s","貌美如花哦");
        ps.println();
        ps.print("天真无邪");

        ps.close();
    }
}
