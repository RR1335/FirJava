package go.baijing.outerinner;

public class Outer {

    int a = 10;
    static int b = 200;

    static class Inner {

        public void show01( ) {
            System.out.println("非 static 调用");

//            直接调用会出错，需要生成外部类的对象
//            System.out.println(a);
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
        }

        public static void show02() {
            System.out.println("static 调用");
//            System.out.println(a);
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
        }
    }
}
