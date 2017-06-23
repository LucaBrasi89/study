package DL;

import java.sql.*;

/**
 * Created by andrew on 22.06.17.
 */
public class CRUD  {


    private Connection con;
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    public void createConnection() throws SQLException, ClassNotFoundException {


        //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost/sunrise_airport","root","andrew89");

    }


    public void doQuery() throws SQLException {

        //STEP 4: Execute a query
        System.out.println("Creating statement...");
        Statement stmt = con.createStatement();
        String sql;
        sql = "SELECT * FROM flights WHERE typeOfFlight='depature'";
        ResultSet rs = stmt.executeQuery(sql);


        while(rs.next()) {
            //Retrieve by column name
            String airport = rs.getString("airport");


            //Display values
            System.out.print("time: " + airport);

        }
    }




}
