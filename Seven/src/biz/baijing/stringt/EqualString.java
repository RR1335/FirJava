package biz.baijing.stringt;

public class EqualString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 -" + System.identityHashCode(s1));
        System.out.println("s2 -" + System.identityHashCode(s2));

        System.out.println("s1 == s2 : " + (s1 == s2) );

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println("s3 -" + System.identityHashCode(s3));
        System.out.println("s4 -" + System.identityHashCode(s4));

        System.out.println("s3 == s4 : " + (s3 == s4) );

        System.out.println("s1 == s3 : " + (s1 == s3) );

        boolean b = s1.equals(s2);
        System.out.println("s1.equals(s2) - " + b);

        String s5 = "Abc";

        boolean b1 = s1.equals(s5);
        System.out.println("s1.equals(s5) - " + b1);

        boolean b2 = s1.equalsIgnoreCase(s5);
        System.out.println("s1.equalsIgnoreCase(s5) - " + b2);

    }
}
