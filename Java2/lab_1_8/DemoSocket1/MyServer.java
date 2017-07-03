package lab_1_8.DemoSocket1;

import demosocket.ServerThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by andrew on 06.06.17.
 */
public class MyServer {


    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(6666);
        int threadCounter = 0;

        while (true) {

            Socket s = ss.accept();//establishes connection
            Thread th = new ServerThread(s);
            th.start();
            threadCounter++;
            System.out.println(threadCounter);
            if (threadCounter == 10) {
                break;
            }
        }

    }


}

