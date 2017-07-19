package DL;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by andrew on 22.06.17.
 * <p>
 * Represents a low-level mechanis for working with MySQL DB.
 * Contain basic operations: create connections, send queries, close connections.
 * Data for connections get from property file.
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

    //    represents a mechanism for working with SELECT qeuries
    public ResultSet doQuery(String query) throws SQLException {

        //STEP 4: Execute a query
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        return rs;

    }


    //    represents a mechanism for working with INSERT qeuries
    public void execQuery(String query) throws SQLException {

        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);

    }

    //    parsing property file for getting connection
    public void getProperties() {

        prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("core/src/resources/properties.cfg");
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
