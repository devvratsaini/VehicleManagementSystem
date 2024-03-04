import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DatabaseCredentials.getUrl(),
                    DatabaseCredentials.getUname(), DatabaseCredentials.getPass());
            System.out.println("Connection successfully established");
            Statement stmt = conn.createStatement();
            String showDatabaseQuery = "desc customer";
            ResultSet rs = stmt.executeQuery(showDatabaseQuery);
            System.out.println("\nQuery : \"" + showDatabaseQuery + "\"");
            while (rs.next()) {
                    System.out.printf("%-20s %-20s %-20s %-20s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// for inserting values into database
//			System.out.print("Enter username to add: ");
//			String un = sc.next();
//			System.out.print("Enter password to add: ");
//			String pw = sc.next();
//			String insertValueQuery = "insert into login values ('" + un + "', '" + pw + "');";
//			stmt.executeUpdate(insertValueQuery);
//			System.out.println("Values inserted successfully");

// for updating password of a user in database
//        System.out.print("Enter username to update password for: ");
//        String un = sc.next();
//        System.out.print("Enter new password: ");
//        String new_pw = sc.next();
//
//        String updateRecordQuery = "update login set pass = '" + new_pw + "' where uname = '" + un + "';";
//        stmt.executeUpdate(updateRecordQuery);
//        System.out.println("Password updated successfully.");

// for logging in
//			System.out.print("Enter username: ");
//			String user_uname = sc.next();
//			System.out.print("Enter password: ");
//			String user_pass = sc.next();
//			boolean loggedIn = false;
//			while(rs.next()) {
//				if(user_uname.equals(rs.getString(1))) {
//					if(user_pass.equals(rs.getString(2))) {
//						System.out.println("Login successful.");
//						loggedIn = true;
//						break;
//					}
//				}
//			}
//			if(loggedIn == false) {
//				System.out.println("Login unsuccessful.");
//			}
