package io.baijing.OuterExp;

public class RunOuter {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();

        Outer.Inner ooi = new Outer().new Inner();
        ooi.show();
    }
}
