package io.baijing.interfacedefault;

public interface Inter {

    public abstract void interMethod();

    public default void show() {
        System.out.println("default _ show");
    }
}
