package ioimprove.baijing.bufferedchar;

import java.io.*;

public class BufferedStreamCharRun {
    public static void main(String[] args) throws IOException {

        String INFOLDER = "/Users/ann/DJava/testfile/test/a.txt";
        String OUTFOLDER = "/Users/ann/DJava/testfile/test/d.txt";

        FileReader fr = new FileReader(INFOLDER);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(OUTFOLDER, true); // 追加，true 在这里
        BufferedWriter bw = new BufferedWriter(fw);  // BufferedWriter 无 追加参数 true

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }


        br.close();
        bw.close();

    }
}
