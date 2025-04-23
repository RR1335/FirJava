package dynamicproxy.baijing.dp;

public class SingerActionRun {
    public static void main(String[] args) {

        SingerClass sc = new SingerClass("宝哥儿");
        SingerProxyInterface proxy = ProxyUtilClass.createProxy(sc);

        String res = proxy.sing("漂洋过海来看你");
        System.out.println(res);


    }
}
