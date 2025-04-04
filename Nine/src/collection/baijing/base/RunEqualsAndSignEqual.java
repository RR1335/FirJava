package collection.baijing.base;

public class RunEqualsAndSignEqual {
    public static void main(String[] args) {

        String x = "string";
        String y = "string";
        String z = new String("string");
        System.out.println(x==y); // true
        System.out.println(x==z); // false
        System.out.println(x.equals(y)); // true
        System.out.println(x.equals(z)); // true

        System.out.println("x -" + System.identityHashCode(x));
        System.out.println("y -" + System.identityHashCode(y));

        System.out.println("z -" + System.identityHashCode(z));

        String s = new String("string");
        System.out.println("s -" + System.identityHashCode(s));
        System.out.println(s.equals(z));


    }
}
