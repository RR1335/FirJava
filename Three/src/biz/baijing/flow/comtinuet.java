package biz.baijing.flow;

public class comtinuet {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if ( i == 4) {
                System.out.println(i + " is 4.");

                continue;

//                System.out.println("继续嘛"); 语法错误 无法执行该语句。
            }
            System.out.println("F" + i);
        }
    }
}
