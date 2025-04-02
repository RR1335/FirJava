package io.baijing.staticmethod;

public class StaticMethod implements InterStatic{
    @Override
    public void InterMethod() {
        System.out.println("abstract  InterMethod");
    }

    // StaticMethod 调用 这个 show 方法 ，
    public static void show() {
        System.out.println(" StaticMehtod  static   -- show ");
    }
}
