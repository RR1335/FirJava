package io.baijing.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class SortStreamRun {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/ann/DJava/testfile/test/s.txt");

        StringBuilder sb = new StringBuilder();

        int len;
        while ((len = fr.read()) != -1) {
            sb.append((char) len);
        }
        fr.close();

        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                            .map(Integer::parseInt)
                            .sorted()
                            .toArray(Integer[]::new);

        FileWriter fw = new FileWriter("/Users/ann/DJava/testfile/test/s1.txt");

        String s = Arrays.toString(arr).replaceAll(",", "-");
        String res = s.substring(1, s.length() - 1);
        fw.write(res);

        fw.close();


    }
}
