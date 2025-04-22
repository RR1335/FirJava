package biz.baijing.multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSendRun {
    public static void main(String[] args) throws IOException {

        MulticastSocket ms = new MulticastSocket();

        String str = "Hello multicast signal" ;
        byte[] bytes = str.getBytes();
        InetAddress group = InetAddress.getByName("224.0.0.1");  // 组播，地址
        int port = 21000;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, group, port);

        ms.send(dp);

        ms.close();

    }
}
