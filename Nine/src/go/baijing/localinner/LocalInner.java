package go.baijing.localinner;

public class LocalInner {

    public void show() {

        class Inner {
            String name = "Sam";
            int age;

            public void method01() {
                System.out.println("name = " + name);
            }
        }

        Inner i = new Inner();
        i.method01();
        System.out.println(i.name);

    }
}
