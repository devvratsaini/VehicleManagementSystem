import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PasswordCheck {
	
	// returns true if password is strong
	// returns false if password is weak
	
	boolean passwordStrength(String password) {
		int n = password.length();
		if(n<8) {
			return false;
		}
		else {
		
		boolean hasLower=false,hasUpper=false,hasDigit=false,spchar=false;
		
		Set<Character> set = new HashSet<Character>(
				Arrays.asList('!', '@', '#', '$', '%', '^', '&', 
                        '*'));
		for(char i:password.toCharArray()) {
			if (Character.isLowerCase(i)) 
                hasLower = true; 
            if (Character.isUpperCase(i)) 
                hasUpper = true; 
            if (Character.isDigit(i)) 
                hasDigit = true; 
            if (set.contains(i)) 
                spchar = true; 
		}
		
		return hasLower && hasUpper && hasDigit && spchar;
		}
				
	}
	
}
