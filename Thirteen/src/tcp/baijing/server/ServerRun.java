package tcp.baijing.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRun {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(20002);

        while (true) {
            Socket socket = ss.accept();

            new Thread(new ServerThreadClass(socket)).start();

        }

    }
}
