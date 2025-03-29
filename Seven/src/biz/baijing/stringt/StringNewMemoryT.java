package biz.baijing.stringt;

public class StringNewMemoryT {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("a Address -" + System.identityHashCode(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            System.out.println(a[i] + " - " + System.identityHashCode(a[i]));
        }

        String s1 = new String(a);
        System.out.println(s1);
        System.out.println(s1 + " s1- " +System.identityHashCode(s1));
        String s2 = new String(a);
        System.out.println(s2);
        System.out.println(s2 + " s2- " +System.identityHashCode(s2));

        String s3 = new String(s2);
        System.out.println(s3);
        System.out.println(s3 + " s3- " +System.identityHashCode(s3));

        String s4 = s2;
        System.out.println("s4 = s2 -" + s4);
        System.out.println(s4 + " s4- " +System.identityHashCode(s4));

        String s5 = "abcde";
        System.out.println(s5);
        System.out.println(s4 + " s5- " +System.identityHashCode(s4));
    }
}
