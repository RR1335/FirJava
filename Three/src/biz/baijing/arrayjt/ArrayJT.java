package biz.baijing.arrayjt;

public class ArrayJT {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };

        int[] b = new int[5];

        for (int i = 0; i < b.length; i++) {
            int addressnum = System.identityHashCode(b[i]);
            System.out.println(b[i]);
            System.out.println(addressnum);
            b[i] = a[i];
            System.out.println("- "+b[i]);
            int addressnum1 = System.identityHashCode(b[i]);
            System.out.println(addressnum1);
            System.out.println("a[i] -"+System.identityHashCode(a[i]));
        }

    }
}


/*
初始地址一致，赋值后地址变化了。
0
406484219
- 1
1145536624
0
406484219
- 2
1467800406
0
406484219
- 3
1378210981
0
406484219
- 4
427032502
0
406484219
- 5
1632614632
 */

/*
0
406484219
- 1
1145536624
a[i] -1145536624
0
406484219
- 2
1467800406
a[i] -1467800406
0
406484219
- 3
1378210981
a[i] -1378210981
0
406484219
- 4
427032502
a[i] -427032502
0
406484219
- 5
1632614632
a[i] -1632614632
 */