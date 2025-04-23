package tcp.baijing.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ClientRun {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",20001);

//        Scanner sc = new Scanner(System.in);
        String str = "Send ... Something.";
        OutputStream os = socket.getOutputStream();

//        while (true) {
//            System.out.println("Plaese input ： ");
//            String input = sc.nextLine();
//            if (input.equals("exit")) {
//                break;
//            }
//            os.write(input.getBytes());
//        }

        os.write(str.getBytes());

        socket.shutdownOutput();


        // 接收服务器数据
        InputStream ins = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(ins);
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }

        socket.close();

    }
}
