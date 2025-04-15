package printstream.baijing.system;

import java.io.PrintStream;

public class SystemOutRun {
    public static void main(String[] args) {

        // 标准输出流 public static final PrintStream out = null;
        // 本身就是 PrintStream
        PrintStream ps = System.out;

        // jvm 默认打印到控制台 Console
        // System.out.println
        ps.println("这是标准输出流！");



    }
}
