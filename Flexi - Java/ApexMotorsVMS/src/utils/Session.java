package utils;

import java.util.ArrayList;

public class Session {
    
    // static data members
    private static boolean userSignedIn = false;
    private static int accountId = -1;
    private static String username = null;
    private static String password = null;
    private static String email = null;
    private static ArrayList<String> carList = new ArrayList<>();

    // getters and setters
    public static boolean isUserSignedIn() {
        return userSignedIn;
    }

    public static void setUserSignedIn(boolean userSignedIn) {
        Session.userSignedIn = userSignedIn;
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
    
    public static int getAccountId() {
        return accountId;
    }
    
    public static void setAccountId(int accountId) {
        Session.accountId = accountId;
    }
    
    public static String getEmail() {
        return email;
    }
    
    public static void setEmail(String email) {
        Session.email = email;
    }
    
    // custom methods
    public static void setSignIn(int accountId, String username, String password, String email) {
        Session.userSignedIn = true;
        Session.accountId = accountId;
        Session.username = username;
        Session.password = password;
        Session.email = email;
    }
    
    public static void setSignOut() {
        Session.userSignedIn = false;
        Session.accountId = -1;
        Session.username = null;
        Session.password = null;
        Session.email = null;
        Session.carList.clear();
    }
    
    public static boolean addCar(String carModel) {
        if (carList.size() < 4) {
            return carList.add(carModel);
        } else {
            return false;
        }
    }
    
    public static void removeCar(int index) {
        carList.remove(index);
    }
    
    public static int getCarCount() {
        return carList.size();
    }
    
    public static String getCarModel(int index) {
        return carList.get(index);
    }
    
    public static ArrayList getCarList() {
        return carList;
    }
}
