package dynamicproxy.baijing.dp;

public class SingerClass implements SingerProxyInterface {
    private String name;

    public SingerClass() {

    }
    public SingerClass(String name) {
        this.name = name;
    }

    // 唱歌
    @Override
    public String sing(String name) {
        System.out.println(this.name + " sing " + name);
        return "Thanks";
    }

    @Override
    public void dance() {
        System.out.println(this.name + " dancing ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
