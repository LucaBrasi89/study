package lab_1_8.TestURLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by andrew on 09.06.17.
 * <p>
 * Create new project called TestURLConnection.
 * Add package “com.brainacad.oop.testurlconnect”.
 * Create a class Main with a main() method, which:
 * <p>
 * 1) Defines a resource type URL ("http://www.brainacad.com");
 * 2) Establishes with him the type of connection URLConnection;
 * 3) Opens a stream for reading and outputs the result
 */
public class Main {

    public static void main(String[] args) throws IOException {

        URL brainAcad = new URL("http://www.brainacad.com");
        URLConnection yc = brainAcad.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {

            System.out.println(inputLine);

        }
        in.close();

    }
}
