package reflection.baijing.fields;

import java.lang.reflect.Field;

public class FieldsRun {
    public static void main(String[] args) throws ClassNotFoundException {


        Class<?> cc = Class.forName("reflection.baijing.fields.StudentClass");

        Field[] cf = cc.getFields();
        for (Field f : cf) {
            System.out.println(f);
        }

        System.out.println("------------------------");

        Field[] df = cc.getDeclaredFields();
        for (Field f : df) {
            System.out.println(f);
            int mf = f.getModifiers();
            System.out.println(f + " - " +mf);
        }

    }
}
