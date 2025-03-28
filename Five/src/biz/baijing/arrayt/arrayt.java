package biz.baijing.arrayt;

public class arrayt {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int f = 2;
        int t = 5;
        int[] b = copyOfRange(a,(f-1),(t-1));

        for (int i = 0; i < b.length ; i++) {
            System.out.print(b[i] + " ");
        }

    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];

        int index = 0;

        for (int i = from; i < to; i++) {
            newArr[index++] = arr[i];
        }
        return newArr;
    }
}
