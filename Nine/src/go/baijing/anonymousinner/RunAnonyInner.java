package go.baijing.anonymousinner;

public class RunAnonyInner {
    public static void main(String[] args) {

        /*
    匿名内部类格式
    new 类或接口名() {
        重写方法
    };
 */
        // 匿名内部类
        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写内部类 ……方法");
            }
        };

        new AnonyClass(){

            @Override
            public void ano() {
                System.out.println("重写了对象的抽象类，匿名");
            }
        };

    }
}
