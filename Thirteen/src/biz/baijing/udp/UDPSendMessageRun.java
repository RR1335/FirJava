package biz.baijing.udp;

import java.io.IOException;
import java.net.*;

public class UDPSendMessageRun {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

        String str = "Hello UDP Send Message .";
        byte[] bytes = str.getBytes();

        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 50981; //

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        ds.send(dp);

        ds.close();

    }
}
