package biz.baijingiInheritancejt;

public class InheritanceJT {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.ziShow();
    }
}

class   Fu{
    String name = "Fu Class";
    String age = "18";
}

class Zi extends Fu{
    String name = "Zi Class";
    String maoqiu = "MaoQiu";

    public void ziShow() {
        String name = "Zi method Class";


        System.out.println(maoqiu);

        System.out.println(this.maoqiu);
        System.out.println(name);
        System.out.println(this.name);
        // 重名后的访问
        System.out.println(super.name);

        // 就近原则
        // age
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
