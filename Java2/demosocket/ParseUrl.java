package demosocket;

import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by andrew on 04.06.17.
 */
public class ParseUrl {

    public static void main(String[] args) throws IOException {

        String city = "Moscow";

        URL weather = new URL("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=6b240f4b248bfa146a36f2bd7c2c4e71");
        URLConnection yc = weather.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);

            JSONObject object = new JSONObject(inputLine);
            Double o = object.getJSONObject("main").getDouble("temp");

            System.out.println(o);

        }


    }

}
