package apexmotorsvms.utils;

public class Session {
    
    // static data members
    private static boolean userSignedIn = false;
    
    // instance data members
    private static String accountType = null;
    private static String username = null;
    private static String password = null;

    // getters and setters
    public static boolean isUserSignedIn() {
        return userSignedIn;
    }

    public static void setUserSignedIn(boolean userSignedIn) {
        Session.userSignedIn = userSignedIn;
    }

    public static String getAccountType() {
        return accountType;
    }

    public static void setAccountType(String accountType) {
        Session.accountType = accountType;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Session.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Session.password = password;
    }
}
