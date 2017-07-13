package DL;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by andrew on 22.06.17.
 */
public class CRUD {


    private Connection con;
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private Properties prop;
    private String dbName;
    private String dbUser;
    private String dbPasswd;

    public CRUD() {

        getProperties();

    }

    public void createConnection() throws SQLException, ClassNotFoundException {


        //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(
                String.format("jdbc:mysql://localhost/%s", dbName), dbUser, dbPasswd);

    }


    public ResultSet doQuery(String query) throws SQLException {

        //STEP 4: Execute a query
        System.out.println("Creating statement...");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        return rs;


    }


    public void getProperties() {

        prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("/media/Maindata/Дело/study/Java Exersises/SunriseAirport/core/src/properties.cfg");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            dbName = prop.getProperty("dbName");
            dbUser = prop.getProperty("dbUser");
            dbPasswd = prop.getProperty("dbPasswd");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public void closeConnection() {

        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
