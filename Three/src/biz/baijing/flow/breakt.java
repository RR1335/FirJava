package biz.baijing.flow;

public class breakt {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if ( i == 4 ) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("循环结束了。 i= 4");
    }
}
