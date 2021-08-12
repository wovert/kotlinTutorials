package net.wovert.java.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        String host = "127.0.0.1";
        int port = 8888;

        // 1. create ServerSocket
        ServerSocket server = new ServerSocket(port);

        // 2. accept from client user
        Socket socket = server.accept();

        // 3. get from client stream object
        InputStream clientObj = socket.getInputStream();

        // 4. read client data
        byte[] bytes = new byte[1024];

        int len = clientObj.read(bytes);
        System.out.println(new String(bytes, 0, len));

        OutputStream os = socket.getOutputStream();
        os.write("收到客户端数据".getBytes(StandardCharsets.UTF_8));

        socket.close();
        server.close();

    }
}
