package serversocket;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Emma on 2018/8/8.
 */
public class ChatSocket extends Thread {
    Socket socket;

    public ChatSocket(Socket socket) {
        this.socket = socket;
    }

    public void out(String out) {
        try {
            socket.getOutputStream().write(out.getBytes("UTF-8"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        int count=0;
        while (true){
            count++;
            out("loop+"+count);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
