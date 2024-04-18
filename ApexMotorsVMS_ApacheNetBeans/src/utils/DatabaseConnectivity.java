package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity {
    private static String username = "root";
    private static String password = "rutu2004";
    private static String url = "jdbc:mysql://127.0.0.1:3306/apexmotors_vms";

    // functions for database connectivity
    public static Connection connectDatabase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,
                username, password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
