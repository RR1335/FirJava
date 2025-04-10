package trycatch.baijing.base;

public class RunTryCatch01 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            System.out.println(arr[12]); // ArrayIndexOutOfBoundsException
            System.out.println(" 异常之后，会执行到这里吗 ？"); // 不会，直接执行 catch 语句
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {  // catch 没有捕获异常，会被 jvm 接管
            System.out.println( "数据越界。" + e);
        }

        System.out.println("执行结束了 ～ ");
    }
}
