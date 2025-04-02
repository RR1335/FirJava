package io.baijing.OuterInner;

public class Outer {
    private static int a = 10;

    static class Inner {
        private int a = 20;

        public void show() {
            int a =30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.a);
        }
    }
}
