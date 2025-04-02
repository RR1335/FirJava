package io.baijing.interfacedefault;

public interface InterB {

    void interMethod();

    public  default void show() {
        System.out.println("default  InterB _ show");
    }
}
