package lab_1_8;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by andrew on 04.06.17.
 */
public class MyServer {


    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();//establishes connection
            ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
            Student inStudent = (Student) dis.readObject();
            System.out.println(inStudent.toString());
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

