package lab_1_8.DemoSocket1;

import lab_1_8.DemoSocket.Student;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by andrew on 06.06.17.
 */


public class ServerThread extends Thread {

    private Socket s;

    public ServerThread(Socket socket) {
        this.s = socket;
    }

    @Override
    public void run() {

        try {
            ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
            System.out.println("PONG");
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}