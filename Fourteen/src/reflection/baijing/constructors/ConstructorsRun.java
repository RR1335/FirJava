package reflection.baijing.constructors;

import java.lang.reflect.Constructor;

public class ConstructorsRun {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> cc = Class.forName("reflection.baijing.constructors.StudentClass");

        Constructor<?>[] cts = cc.getConstructors();
        for (Constructor<?> c : cts) {
            System.out.println(c);
        }

        System.out.println("------------------------------------");

        Constructor<?>[] dcs   = cc.getDeclaredConstructors();
        for (Constructor<?> dc : dcs) {
            System.out.println(dc);
            int modifiers = dc.getModifiers();
            System.out.println(dc + "权限 - " + modifiers);
        }

    }
}
