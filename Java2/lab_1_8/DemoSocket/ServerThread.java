package lab_1_8.DemoSocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by andrew on 04.06.17.
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
            Student inStudent = (Student) dis.readObject();
            inStudent.setId(2);
            System.out.println(inStudent.toString());

            ObjectOutputStream ous = new ObjectOutputStream(s.getOutputStream());
            ous.writeObject(inStudent);
            ous.flush();
            ous.close();
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
