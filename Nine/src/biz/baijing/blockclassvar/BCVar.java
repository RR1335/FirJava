package biz.baijing.blockclassvar;

public class BCVar {
    public static void main(String[] args) {
        BlockClassVar bc = new BlockClassVar();
        System.out.println(bc);
        BlockClassVar bc2 = new BlockClassVar("Sam",19);
        System.out.println(bc2.getName());
    }
}
