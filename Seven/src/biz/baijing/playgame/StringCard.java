package biz.baijing.playgame;

public class StringCard {
    public static void main(String[] args) {

        String cardId = "110101200901092306";

        // 按照身份证的规则截取响应的字符串值
        String year = cardId.substring(6, 10);
        String month = cardId.substring(10, 12);
        String day = cardId.substring(12, 14);

        char gender = cardId.charAt(17);

//        System.out.println(gender - 48);
        // ASCII 的值减 0 ，即等于数字实际的值
        int genderASCII = getASCII(gender);
        int genderNum = genderASCII - 48;

        if (genderNum % 2 == 0) {
            System.out.println("性别： 女");
        } else {
            System.out.println("性别：男");
        }

        System.out.println("出生年月日： " + year + "年" + month + "月" + day + "日");

    }

    public static int getASCII(char str) {
        // 借助 java 默认的强制类型转化 char 在进行计算时变成 int
        int ASCIINum = str + 0;
        return ASCIINum ;
    }
}
