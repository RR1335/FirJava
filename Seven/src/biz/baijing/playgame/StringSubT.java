package biz.baijing.playgame;

public class StringSubT {
    public static void main(String[] args) {

        String phoneNumber = "13300229978";

        String startNumber = phoneNumber.substring(0, 3);

        String endNumber = phoneNumber.substring(7);

        String result = startNumber + "****" + endNumber;
        System.out.println(result);
    }
}
