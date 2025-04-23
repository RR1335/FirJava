package tcp.baijing.server;

import java.io.*;
import java.net.Socket;

public class ClientRun {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",20002);

        String FILEPATHNAME = "/Users/ann/DJava/testfile/test/qq.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(FILEPATHNAME));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        byte[] buffer = new byte[1024];
        int len;
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }

        socket.shutdownOutput();


        String strline   = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
        System.out.println(strline);

        socket.close();
    }
}
