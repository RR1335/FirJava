package hutool.baijing.io;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.io.IOException;

public class HuToolRun {
    public static void main(String[] args) throws IOException {

        File file = FileUtil.file("~/DJava","hutool","x.java");
//        System.out.println(file); // /Users/ann/DJava/hutool/x.java

        File touch = FileUtil.touch(file);
        System.out.println(touch);

    }
}
