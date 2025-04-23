package reflection.baijing.methods;

import java.lang.reflect.Method;

public class MethodsRun {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> cst = Class.forName("reflection.baijing.methods.StudentsClass");

//        Method[] sm = cst.getMethods();
//        for (Method m : sm) {
//            System.out.println(m);
//            int stm = m.getModifiers();
//            System.out.println(m + " - " +  stm);
//        }

        Method[] dst = cst.getDeclaredMethods();
        for (Method m : dst) {
            System.out.println(m);
            int stm = m.getModifiers();
            System.out.println(m + " - " +  stm);
        }

    }
}
