package file.baijing.createdelete;

import java.io.File;
import java.io.IOException;

public class RunCreateDelete {
    public static void main(String[] args) throws IOException {

        File f = new File("/Users/ann/DJava/testfile/c2.txt");
        boolean b = f.createNewFile();
        System.out.println("createNewFile - " + b);



    }
}
