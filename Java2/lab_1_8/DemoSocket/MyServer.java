package lab_1_8.DemoSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by andrew on 04.06.17.
 */
public class MyServer extends Thread {


    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(6666);
        while (true) {

            Socket s = ss.accept();//establishes connection
            Thread th = new ServerThread(s);
            th.start();
        }

    }


}

