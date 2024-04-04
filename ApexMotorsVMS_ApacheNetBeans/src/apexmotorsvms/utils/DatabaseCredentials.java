package apexmotorsvms.utils;

public class DatabaseCredentials {
    private static String uname = "root";
    private static String pass = "password";
    private static String url = "jdbc:mysql://127.0.0.1:3306/apexmotors_vms";

    public static String getUname() {
        return uname;
    }
    public static String getPass() {
        return pass;
    }
    public static String getUrl() {
        return url;
    }
}
