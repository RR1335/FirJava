package io.baijing.OuterInner;

public class Outer {

    private static int a = 10;

    public Outer() {
        System.out.println("() -" +System.identityHashCode(a));
    }
    public void show() {
        System.out.println(a);
        System.out.println("show -" +System.identityHashCode(a));
    }

    static class Inner {
        private int a = 20;

        public void show() {
            int a =30;
            System.out.println(a);
            System.out.println(" -" +System.identityHashCode(a));
            System.out.println(this.a);
            System.out.println("this -" + System.identityHashCode(this.a));
            System.out.println(Outer.a);
            System.out.println("Outer -" + System.identityHashCode(Outer.a));
        }
    }
}
