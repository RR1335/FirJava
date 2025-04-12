package io.baijing.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortContextOfFilesRun {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/ann/DJava/testfile/test/s.txt");

        StringBuilder sb = new StringBuilder();

        int len;
        while ((len = fr.read()) != -1) {
            sb.append((char) len);
        }
        fr.close();

        String str   = sb.toString();
        String[] strs = str.split("-");

        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (String str1 : strs) {
            ls.add(Integer.parseInt(str1));
        }

//        int[] arr = new int[strs.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(strs[i]);
//        }

        Collections.sort(ls);

        FileWriter fw = new FileWriter("/Users/ann/DJava/testfile/test/s1.txt");
        for (int i = 0; i < ls.size(); i++) {
            if (i == ls.size() - 1) {
                fw.write(ls.get(i) + "");
            } else {
                fw.write(ls.get(i) + "-");
            }
        }
        fw.close();




    }
}
