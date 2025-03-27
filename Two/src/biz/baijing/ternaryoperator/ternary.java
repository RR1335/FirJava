package biz.baijing.ternaryoperator;

public class ternary {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        //  >  , 5
        // < , 11
        int res = a < 30 ? a + 1 : b - 15;
        System.out.println( res );
    }
}
