package trycatch.baijing.base;

public class RunTryCatch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            System.out.println(arr[12]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( "数据越界。" + e);
        }

        System.out.println("执行结束了 ～ ");
    }
}
