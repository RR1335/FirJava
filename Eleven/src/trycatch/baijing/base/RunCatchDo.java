package trycatch.baijing.base;

public class RunCatchDo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            System.out.println(arr[12]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
//            java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
//            at trycatch.baijing.base.RunCatchDo.main(RunCatchDo.java:9)

/*             String ms = e.getMessage();
             Index 12 out of bounds for length 10*/

//             String ms = e.toString();
//             java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10

//            System.out.println(ms);
        }

        System.out.println("执行结束了。");

        System.err.println("error" + 123);
    }
}
