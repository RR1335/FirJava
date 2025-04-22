package biz.baijing.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressRun {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getByName("192.168.31.124");
        System.out.println(address);

        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);

        String hostName = address.getHostName();
        System.out.println(hostName);

    }
}
