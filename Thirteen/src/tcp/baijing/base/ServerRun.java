package tcp.baijing.base;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRun {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(20001);

        // 阻塞的
        Socket st = ss.accept();

        InputStream ism = st.getInputStream();
        int b;
        while ((b = ism.read()) != -1) {
            // 中文乱码
            System.out.print((char) b);
        }

        st.close();  // 和客户端的 连接断开了
        ss.close();
    }
}
