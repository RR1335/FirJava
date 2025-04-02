package io.baijing.OuterExp;

public class Outer {
    private int a = 10;

    public void show() {
        System.out.println("Outer.class.a:" + a);
        System.out.println("Outer.class.a.hashcode:" + System.identityHashCode(a));
    }

    class Inner {

        private int a = 20;

        public void show() {
            System.out.println("Inner.class.a:" + this.a);
            System.out.println("Inner.class.a.hashcode:" + System.identityHashCode(this.a));
            System.out.println("Inner.Outer.a:" + Outer.this.a);
            System.out.println("Inner.Outer.a.hashcode:" + System.identityHashCode(Outer.this.a));
        }
    }
}
