package apexmotorsvms.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AccountValidationUtils {

    // returns true if password is strong else false if password is weak
    static boolean validatePassword(String password) {

        int len = password.length();

        if (len < 8) {  // minimum password length requirement not met
            return false;
        } else {

            // validation flags
            boolean hasLower=false,
                    hasUpper=false,
                    hasDigit=false,
                    hasSpChar=false;

            Set<Character> spChars = new HashSet<Character>(
                    Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*'));

            for (char ch :password.toCharArray()) {
                if (Character.isLowerCase(ch))
                    hasLower = true;
                if (Character.isUpperCase(ch))
                    hasUpper = true;
                if (Character.isDigit(ch))
                    hasDigit = true;
                if (spChars.contains(ch))
                    hasSpChar = true;
            }

            return hasLower && hasUpper && hasDigit && hasSpChar;
        }

    }

}