package biz.baijing.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSendRun {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入 ： ");
            String message = sc.nextLine();
            if (message.equals("886")) {

                break;
            }
            byte[] bytes = message.getBytes();

            InetAddress address = InetAddress.getByName("127.0.0.1");

            int port = 10099;

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
            ds.send(dp);
        }

        ds.close();

    }

}
