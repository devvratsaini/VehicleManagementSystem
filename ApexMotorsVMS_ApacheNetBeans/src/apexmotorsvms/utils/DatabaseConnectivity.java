package apexmotorsvms.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity {
    private static String uname = "root";
    private static String pass = "password";
    private static String url = "jdbc:mysql://127.0.0.1:3306/apexmotors_vms";

    // functions for database connectivity
    public static Connection connectDatabase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,
                uname, pass);
            System.out.println("Connection successfully established");
            return conn;
        } catch (Exception e) {
            System.out.println("Connection Unsuccessful.");
            e.printStackTrace();
        }
        return null;
    }
}
