package biz.baijing.playgame;

public class arrToStringJ {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        String s = arrToString(arr);
        System.out.println(s);
    }


    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }

        String result = "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1)) {
                result = result + arr[i] ;
            } else {
                result = result + arr[i] + ",";
            }
        }
        // 最后拼接右括号
        result = result + "]";

        // 返回格式 [1,2,3]
        return result;
    }


}
