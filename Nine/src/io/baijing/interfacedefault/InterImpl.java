package io.baijing.interfacedefault;

public class InterImpl implements Inter {

    @Override
    public void interMethod() {
        System.out.println("interMethod -- 实现类重写的方法");
    }

    @Override
    public void show() {
//        Inter.super.show();
        System.out.println("重写写 default show ； 去掉 default 关键字");
    }
}
