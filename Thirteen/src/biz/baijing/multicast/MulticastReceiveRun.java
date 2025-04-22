package biz.baijing.multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiveRun {
    public static void main(String[] args) throws IOException {

        MulticastSocket ms = new MulticastSocket(21000);

        InetAddress group = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(group);

        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, 0,buf.length);

        ms.receive(dp);

        byte[] data = dp.getData();
        String message = new String(data, 0, data.length);

        int length = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        String ip = address.getHostAddress();
        String hostName = address.getHostName();

        System.out.println(hostName + " 发送了信息 ，  接收信息 " + message);

        ms.close();

    }
}
