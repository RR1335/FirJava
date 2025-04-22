package tcp.baijing.base;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientRun {
    public static void main(String[] args) throws IOException {

        Socket st = new Socket("127.0.0.1",20001 );

        // 从 Socket 获取字节流
        OutputStream os = st.getOutputStream();
//        String str = "Hello Server.";
        String str = "你好，服务器！";
        os.write(str.getBytes());

        os.close();
        st.close();
    }
}
