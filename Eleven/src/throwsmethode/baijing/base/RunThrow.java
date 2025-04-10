package throwsmethode.baijing.base;

public class RunThrow {
    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 4, 5};

//        int[] arr = new int[0];
        int[] arr = null;

        int max = getMax(arr);

        System.out.println(max);


    }

    public static int getMax(int[] arr) throws ArithmeticException , ArrayIndexOutOfBoundsException , NullPointerException {
//        if (arr == null || arr.length == 0) {
////            throw new IllegalArgumentException();
//            throw new NullPointerException();
//        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }



}
