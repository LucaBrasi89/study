package lab_1_8.DemoSocket1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by andrew on 06.06.17.
 */
public class MyClient {

    public static void main(String[] args) throws IOException {


        for (int i = 0; i < 9; i++) {
            Socket s = new Socket("localhost", 6666);
            ObjectOutputStream dos = new ObjectOutputStream(s.getOutputStream());
            dos.writeUTF("PING");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dos.flush();
            dos.close();

        }

    }

}
