package biz.baijing.stringt;

public class StringMemoryT {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(System.identityHashCode(s1));

        String s2 = "abc";
        System.out.println("s2 -" + System.identityHashCode(s2));

        s2 = "abcde";
        System.out.println("s2 new -" + System.identityHashCode(s2));

    }
}
