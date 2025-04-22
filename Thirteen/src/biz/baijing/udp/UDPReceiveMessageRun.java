package biz.baijing.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceiveMessageRun {
    public static void main(String[] args) throws IOException {

        // 接收，必须绑定端口，并且和 send port 一致
        DatagramSocket ds = new DatagramSocket(50981);

        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        ds.receive(dp);

        int length = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        byte[] data = dp.getData();        // getData() 才是传递的数据

        System.out.println("接收到信息: " +new String(data,length));
        System.out.println("IP： " + address + " - 端口： " +port);

        ds.close();

    }
}
