package reflection.baijing.base;

public class ReflectionClassRun {
    public static void main(String[] args) throws ClassNotFoundException {

        // rc 则为 reflection.baijing.base.StudentClass 自解码文件的对象
        Class<?> rc = Class.forName("reflection.baijing.base.StudentClass");

        System.out.println("Class 1 - " + rc);

        Class sc = StudentClass.class;

        System.out.println("Class 2 - " + sc);

        System.out.println(sc == rc);

        StudentClass stc = new StudentClass();
        Class<? extends StudentClass> st = stc.getClass();

        System.out.println("Class 3 - " + st);

        System.out.println(st == rc);

    }
}
