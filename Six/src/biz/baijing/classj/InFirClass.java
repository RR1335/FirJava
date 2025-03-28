package biz.baijing.classj;

public class InFirClass {
    public static void main(String[] args) {
        FirClass fc = new FirClass();

        fc.name = "如花";
        fc.age = 18;

        fc.getFir(fc.name, fc.age);
        fc.getAge(fc.age);

        // 跨 package 引用类 需要 import 引用
//        BZClass bz = new BZClass();
//        bz.ring = 10;

    }
}
