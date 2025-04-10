package defineexception.baijing.base;

import java.util.Scanner;

public class RunDef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("hello");
            String name = sc.nextLine();
            if (1 < name.length() && name.length() < 5) {
                System.out.println(name);
            }else {
                throw new ExceptionNameFormat(name + " 范围超过了定义长度。");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
