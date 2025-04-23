package tcp.baijing.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerRun {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(20002);

        Socket socket = ss.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

        String fname = UUID.randomUUID().toString().replace("-","");
        String FILEPATHNAME = "/Users/ann/DJava/testfile/test/1/"+fname+".jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(FILEPATHNAME));

        byte[] buffer = new byte[1024];
        int len;
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
//        bw.newLine();
        bw.flush();


        socket.close();
        ss.close();

    }
}
