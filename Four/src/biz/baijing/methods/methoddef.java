package biz.baijing.methods;

public class methoddef {
    public static void main(String[] args) {
        runMethod();
        System.out.println(" _________   main  _________");
        runMethod2();
    }

    // 定义一个方法
    public static void runMethod() {
        runMethod2();
        System.out.println("hello");
        System.out.println("world");
        System.out.println("!!!");
    }

    public static void runMethod2() {
        System.out.println("method 2");
        System.out.println(" ---------- runMethod -----------  ");
    }
}
