package biz.baijing.arraylist;

public class arrayt {
    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5} ;

        int[] b = { 1,2,3,4,5};
        // b 在内存中的位置： [I@4617c264
        System.out.println(b);
        System.out.println(a);
        // 数组的索引是从 0 开始的，b[0]
        System.out.println(b[2]);
    }
}
