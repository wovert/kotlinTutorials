package net.wovert.java.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPClient {
    // 套接字：IP地址和端口号的网络单位
    public static void main(String[] args) throws IOException {
        String host = "127.0.0.1";
        int port = 8888;

        // 1. create socket
        Socket socket = new Socket(host, port);

        // 2. get OutputStream Object
        OutputStream os = socket.getOutputStream();

        // 3. To Server send message
        os.write("你好服务器".getBytes(StandardCharsets.UTF_8));

        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        // 6. close
        os.close();
    }
}
