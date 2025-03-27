package biz.baijing.relx;

public class rel {
    public static void main(String[] args) {
        // 关系运算符
        float ab = 10;
        int   ac = 10;

        // true
        System.out.println(ab == ac);

        // 都是 false
        System.out.println(ab > ac);
        System.out.println(ab < ac);



        // true
        System.out.println(ab >= ac);
        System.out.println(ab <= ac);

        System.out.println("-------------");

        System.out.println(false & true);
        System.out.println(false & false);
        System.out.println(true & true);

        System.out.println(true | false);
        System.out.println(true | true);
        System.out.println(false & false);

        System.out.println("^");
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);

        System.out.println(" ! ");
        System.out.println(!true);
        System.out.println(!false);

    }
}
