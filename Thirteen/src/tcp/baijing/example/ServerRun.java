package tcp.baijing.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRun {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(20001);

        Socket socket = ss.accept();
        // 将字节流转成字符流
        InputStreamReader ir = new InputStreamReader(socket.getInputStream());
        int ch;
        while ((ch = ir.read() ) != -1) {
            System.out.print((char) ch);

            if (ch == '\n') {
                System.out.println(ch);
            }

        }

        // 服务器回写数据
        String str = "Receive ...";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        socket.close();
        ss.close();

    }
}
