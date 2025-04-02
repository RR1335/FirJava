package in.baijing.oopoutin;

public class Car {
    String carName;
    String carColor;
    int carAge;
    class Engine{
        String engineName;
        String engineAge;

        public void show() {
            System.out.println("发动机名字 -" + engineName);
            System.out.println(carName);
        }
    }

    public void show() {
        System.out.println(this.carName);
        // 没有发动机的对象， engineName
        // 必须创建内部类对象，才能调用
        Engine e = new Engine();
        System.out.println(e.engineName);
    }
}
