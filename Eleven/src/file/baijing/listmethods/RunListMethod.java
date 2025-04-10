package file.baijing.listmethods;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class RunListMethod {
    public static void main(String[] args) throws IOException {

        // windows 系统就是展示所有盘符，macOS 展示所有的盘根目录
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));




    }
}
