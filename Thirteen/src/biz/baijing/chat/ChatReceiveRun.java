package biz.baijing.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatReceiveRun {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(10099);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            ds.receive(dp);

            byte[] buf = dp.getData();
            int length = dp.getLength();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();

            System.out.println(address + " 发送 " + new String(buf, 0, length));
        }


    }
}
