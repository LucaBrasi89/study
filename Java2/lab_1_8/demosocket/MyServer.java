package demosocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
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
            new ServerThread(s);
        }

    }


}

