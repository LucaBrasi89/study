package lab_1_8.DemoSocket;

import java.io.*;
import java.net.Socket;

/**
 * Created by andrew on 06.06.17.
 */
public class MyClient {

    public static void main(String[] args) throws IOException {

        try {
            Socket s = new Socket("localhost", 6666);
            ObjectOutputStream dos = new ObjectOutputStream(s.getOutputStream());
//            dos.writeObject(new Student("Peter","philisophy",001));
            dos.writeObject(new Student("Nelly", "informatics", 004));
            dos.writeObject(new Student("Liza", "economics", 007));

        } catch (Exception e) {
            System.out.printf(String.valueOf(e.getStackTrace()));
        }


    }


}
