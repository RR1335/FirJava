package trycatch.baijing.base;

public class RunTryCatch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

/*        try {
            System.out.println(arr[12]); // ArrayIndexOutOfBoundsException
            System.out.println(arr[3]/0); // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( "数据越界。" + e);
        } catch (ArithmeticException e) {
            System.out.println("算数异常, 除数不能为 0 ." + e);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }*/

        try {
            System.out.println(arr[12]); // ArrayIndexOutOfBoundsException
            System.out.println(arr[3]/0); // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println( "数据越界。" + e);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("执行结束了 ～ ");
    }
}
