package demosocket;

import demosocket.serverClient.Security;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by andrew on 04.06.17.
 */
public class ServerThread1 extends Thread {

    private Socket s;

    public ServerThread1(Socket socket) {
        this.s = socket;
    }

    @Override
    public void run() {

        System.out.println("begin");
        Security security = new Security();
        System.out.println("1");

        System.out.println("2");
        try {
            ObjectOutputStream ous = new ObjectOutputStream(s.getOutputStream());
            ous.writeObject(security.getPublicKey());
            ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
            byte[] encr = (byte[]) dis.readObject();
            String input = new String (encr);
            System.out.println(input);
            security.decryptKey(encr);



//            demosocket.Student inStudent = (demosocket.Student) dis.readObject();
//            inStudent.setId(2);
//            System.out.println(inStudent.toString());

//
//            ous.writeObject(inStudent);
            ous.flush();
            ous.close();
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
