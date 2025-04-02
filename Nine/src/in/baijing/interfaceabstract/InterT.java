package in.baijing.interfaceabstract;

public class InterT implements Inter {
    @Override
    public void InterMethod() {
        System.out.println(" InterT implements —— 打印");
        Inter.end();
    }

    // 接口多态
//    public int startInter(Inter i) {
//
//        i.InterMethod();
//        i.endT();
//        Inter.start();
//        Inter.end();
//
//        return 10;
//
//    }
}
