package biz.baijing.inheritclass;

public class Cat extends AnimalClass {

    public void catchMouse() {
        System.out.println("抓老鼠");
    }

    // 子类只能访问非私有的成员
    private void xx() {
        System.out.println("xx" +
                "");
    }
}
