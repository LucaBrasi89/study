package demosocket;

import demosocket.serverClient.Security;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by andrew on 04.06.17.
 */
public class MyServer1 extends Thread {


    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(6666);
        while (true) {


            Socket s = ss.accept();//establishes connection
            Thread th = new demosocket.ServerThread1(s);
            th.start();
        }



    }


}

