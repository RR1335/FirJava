package biz.baijing.methodmemory;

public class MethodParam {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(arr[5]);

        getNum(arr);
        System.out.println(arr[5]);
    }

    public static void getNum(int[] a) {
        // 引用型，变量存储的是 堆内存地址；
        // 内存数据变化，地址不变化，会导致数据值输出变化
        a[5] = 1000;
    }
}
