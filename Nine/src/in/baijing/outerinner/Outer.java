package in.baijing.outerinner;

public class Outer {
    String name;

    private class Inner {

    }

    public Inner getInner() {
        return new Inner();
    }

}
