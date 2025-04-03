package go.baijing.outerinner;

public class RunOuter {
    public static void main(String[] args) {

        // 静态内部类调用  类名直接获取
        Outer.Inner ooi = new Outer.Inner();
        ooi.show01();
        // 静态方法也能被调用，单会是
        ooi.show02();

        // 静态内部类的调用方法
        Outer.Inner.show02();
    }
}
