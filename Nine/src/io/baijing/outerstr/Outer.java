package io.baijing.outerstr;

public class Outer {
    private String a = "100";

    public Outer() {
        System.out.println("Outer.a -" + a);
        System.out.println("Outer.a -" + System.identityHashCode(a));
    }

    public void show() {
        System.out.println("Outer.a -" + a);
        System.out.println("Outer.a -" + System.identityHashCode(a));
    }

    class Inner {
        private String a = "200";

        public void show() {
            String a = "300";
            System.out.println("a -" + a);
            System.out.println("a -" + System.identityHashCode(a));
            System.out.println("Inner.a -" + this.a);
            System.out.println("Inner.a -" + System.identityHashCode(this.a));
            System.out.println("Outer.a -" + Outer.this.a);
            System.out.println("Outer.a -" + System.identityHashCode( Outer.this.a));
        }
    }
}
