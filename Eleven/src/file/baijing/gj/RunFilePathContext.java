package file.baijing.gj;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RunFilePathContext {
    public static void main(String[] args) {

        File f = new File("/Users/ann/DJava/testfile/a.txt");
        long len = f.length();  // 返回字节 char 数
        System.out.println(len);

        // length 无法返回文件夹大小
        File f1 = new File("/Users/ann/DJava/testfile");
        long len01 = f1.length();
        System.out.println(len01);

        File f2 = new File("/Users/ann/DJava/testfile/a.txt");
        String path = f2.getAbsolutePath();
        System.out.println(path);

        File f3 = new File("a.txt");
        System.out.println(f3.getAbsolutePath());

        File f4 = new File("definepath/a.txt");
        // 绝对路径拼接 definepath/a.txt
        System.out.println(f4.getAbsolutePath());

        File f5 = new File("/Users/ann/DJava/testfile/a.txt");
        String path1 = f5.getPath();
        System.out.println(path1);

        File f6 = new File("testfile/a.txt");
        // 定义文件对象时的路径
        System.out.println(f6.getPath());

        File f7 = new File("/Users/ann/DJava/testfile/a.txt");
        // 调用时是文件名，则返回文件名+扩展名
        String filename = f7.getName();
        System.out.println("getName - " + filename);

        File f8 = new File("/Users/ann/DJava/testfile");
        // 调用时是文件夹，则返回文件夹的名字
        String filename1 = f8.getName();
        System.out.println("getName path - " + filename1);

        File f9 = new File("/Users/ann/DJava/testfile/a.txt");
        long time = f9.lastModified(); // 返回，毫秒值
        System.out.println(time);

        // 毫秒值， 年月日时分秒
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(time))));      // 时间戳转换成时间
        System.out.println("格式化结果：" + sd);


//        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
//        System.out.println(timeStamp);
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));      // 时间戳转换成时间
//        System.out.println("格式化结果：" + sd);
//
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
//        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
//        System.out.println("格式化结果：" + sd2);


    }
}
