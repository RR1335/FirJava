package io.baijing.charactorset;

import java.io.FileReader;
import java.io.IOException;

public class CharSetDebugRun {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/ann/DJava/testfile/test/a.txt");

        int b1 = fr.read();
        System.out.println(b1);

        int b2 = fr.read();
        System.out.println(b2);

        int b3 = fr.read();
        System.out.println(b3);
        System.out.println((char)b3);

        int b4 = fr.read();
        System.out.println(b4);

        int b5 = fr.read();
        System.out.println(b5);
        System.out.println((char)b5);

        fr.close();

    }
}
