package lab_1_8.TestUDPDatagram;

import java.io.*;

/**
 * Created by andrew on 08.06.17.
 */
public class testFile {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("fileToSend.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");
//        BufferedReader br = new BufferedReader(new FileReader("fileToSend.txt"));
        byte[] contentInBytes;

        int i = 0;
//        System.out.println(br.readLine());
        while( (i = fis.read() )!= -1) {

            System.out.print((char)i);
        }

        fos.flush();
        fos.close();

    }


}
