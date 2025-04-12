package io.baijing.charactorset;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharSetFileWriterRun {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("/Users/ann/DJava/testfile/test/c.txt");

//        fw.write(28009);

//        fw.write("成功发射卫星了！!!");
//        fw.write("全世界人民大团结！！！",1,3);

        char[] buf = {'a', 'i', '我', '们', 'e', '家','人'};
        fw.write(buf);

        fw.close();



        FileReader fr = new FileReader("/Users/ann/DJava/testfile/test/c.txt");

        char[] buf2 = new char[4];
        int ch;
        while((ch = fr.read(buf2)) != -1) {
            System.out.print(new String(buf2, 0, ch));
        }

        fr.close();

    }
}
