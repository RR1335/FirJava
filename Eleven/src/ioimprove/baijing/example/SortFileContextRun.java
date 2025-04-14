package ioimprove.baijing.example;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortFileContextRun {
    public static void main(String[] args) throws IOException {

        String INFOLDER = "/Users/ann/DJava/testfile/test/a.txt";
        String OUTFOLDER = "/Users/ann/DJava/testfile/test/d.txt";
        FileReader fis = new FileReader(INFOLDER);
        FileWriter fw = new FileWriter(OUTFOLDER);

        BufferedReader br = new BufferedReader(fis);

        String line;
        TreeMap<Integer,String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null ) {
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]), arr[1]);
        }

        br.close();

        System.out.println(tm); // 测试结果

        BufferedWriter bw = new BufferedWriter(fw);
        Set<Map.Entry<Integer,String>> entires = tm.entrySet();
        for (Map.Entry<Integer,String> entry : entires) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();


    }
}
