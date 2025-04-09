package var.baijing.base;

public class RunVarParameters {
    public static void main(String[] args) {
        // Variable-Argument Parameters

        int i =getSum(1,2,2);
        int ii = getSum(1,2,2,3,3,5,6,6,6);
        System.out.println(i);
        System.out.println(ii);

    }

    public static int getSum(int...args) {
//        System.out.println(args); // [I@4617c264 ,结果 是一个地址值， args 是一个数组

        int sum = 0;
        for (int i : args) {
            sum = sum + i;
        }

        return sum ;
    }
}
