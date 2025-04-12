package io.baijing.charactorset;

import java.io.FileReader;
import java.io.IOException;

public class CharSetStreamParamsRun {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/ann/DJava/testfile/test/a.txt");

        char[] buf = new char[4];
        int len;
        while((len = fr.read(buf)) != -1) {
            System.out.print(new String(buf, 0, len));
            // ln 会对行末的 \n 按照字节读取的
//            System.out.println(new String(buf, 0, len ));
        }

        fr.close();
    }
}
