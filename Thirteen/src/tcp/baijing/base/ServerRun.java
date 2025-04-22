package tcp.baijing.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRun {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(20001);

        // 阻塞的
        Socket st = ss.accept();

        InputStream ism = st.getInputStream();
        // 通过转换流，将 byte 流 转换成 charater 流
        InputStreamReader isr = new InputStreamReader(ism);
        BufferedReader br = new BufferedReader(isr);
        int b;
        while ((b = br.read()) != -1) {
            // 中文乱码
            System.out.print((char) b);
        }

        st.close();  // 和客户端的 连接断开了
        ss.close();
    }
}
