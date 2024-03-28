package apexmotorsvms.utils;

public class Session {
    
    private static boolean userSignedIn = false;

    public static boolean isUserSignedIn() {
        return userSignedIn;
    }

    public static void setUserSignedIn(boolean userSignedIn) {
        Session.userSignedIn = userSignedIn;
    }
}
