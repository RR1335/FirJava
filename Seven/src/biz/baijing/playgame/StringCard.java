package biz.baijing.playgame;

public class StringCard {
    public static void main(String[] args) {

        String cardId = "110101200901092303";

        String[] date = getDate(cardId);
        char gender = cardId.charAt(17);

        System.out.println("性别： " + getGender(gender));

        System.out.println("出生年月日： " + date[0] + "年" + date[1] + "月" + date[2] + "日");
    }

    public static String[] getDate(String str) {
        String[] date = new String[3];
        // 按照身份证的规则截取响应的字符串值
        String year = str.substring(6, 10);
        String month = str.substring(10, 12);
        String day = str.substring(12, 14);

        date[0] = year;
        date[1] = month;
        date[2] = day;

        return date;
    }

    public static char getGender(char str) {
        if (str == 'X' || str == 'x') {
            return '男';
        } else  if (str == 'Y' || str == 'y') {
            return '女';
        } else {
            // ASCII 的值减 0 ，即等于数字实际的值
            int genderASCII = getASCII(str);
            int genderNum = genderASCII - 48;

            if (genderNum % 2 == 0) {
                return '女';
            } else {
                return '男';
            }
        }
    }

    public static int getASCII(char str) {
        // 借助 java 默认的强制类型转化 char 在进行计算时变成 int
        int ASCIINum = str + 0;
        return ASCIINum ;
    }

}


//        System.out.println(gender - 48);
