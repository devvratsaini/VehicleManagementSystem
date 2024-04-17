package utils;

import java.util.ArrayList;

public class Session {
    
    // static data members
    private static boolean userSignedIn = false;
    private static ArrayList<String> carList = new ArrayList<>();
    
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
    
    // custom methods
    public static void setSignIn(String accountType, String username, String password) {
        Session.userSignedIn = true;
        Session.accountType = accountType;
        Session.username = username;
        Session.password = password;
    }
    
    public static void setSignOut() {
        Session.userSignedIn = false;
        Session.accountType = null;
        Session.username = null;
        Session.password = null;
    }
    
    public static boolean addCar(String carModel) {
        if (carList.size() < 4) {
            carList.add(carModel);
            return true;
        } else {
            return false;
        }
    }
    
    public static int getCarCount() {
        return carList.size();
    }
    
    public static String getModel(int index) {
        return carList.get(index);
    }
}
