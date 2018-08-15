package serversocket;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Emma on 2018/8/8.
 */
public class ServerListener extends Thread {
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            while (true) {        //一有客户连接就起一个线程
                Socket socket = serverSocket.accept();
                JOptionPane.showMessageDialog(null, "客户连接12345端口");
                new ChatSocket(socket).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
