package ioimprove.baijing.bufferedchar;

import java.io.*;

public class BufferedStreamCharRun {
    public static void main(String[] args) throws IOException {

        String INFOLDER = "/Users/ann/DJava/testfile/test/a.txt";
        String OUTFOLDER = "/Users/ann/DJava/testfile/test/d.txt";

        FileReader fr = new FileReader(INFOLDER);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(OUTFOLDER);
        BufferedWriter bw = new BufferedWriter(fw);

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }


        br.close();
        bw.close();

    }
}
