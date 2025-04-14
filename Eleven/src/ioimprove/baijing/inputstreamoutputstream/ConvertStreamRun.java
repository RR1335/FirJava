package ioimprove.baijing.inputstreamoutputstream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ConvertStreamRun {
    public static void main(String[] args) throws IOException {

        String FRFLODER = "/Users/ann/DJava/testfile/test/a.txt";
        // 指定字符编码读取数据
        FileReader fr = new FileReader(FRFLODER, StandardCharsets.UTF_8); // Charset.forName("UTF_8")



    }
}
