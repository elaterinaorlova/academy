package by.academy.homework3;

import java.util.regex.Pattern;

public class ValidatorApplication {
//	public static final Pattern EMAIL_FORMAT = Pattern.compile("^(.+)@(\\S+)$");
//	"^[A-Za-z0-9+_.-]+@(.+)$"
//	^[A-Za-z0-9+_.-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"
//	^[A-Za-z0-9+_.-]+@(?:[a-zA-Z0-9-]+\\.)+[\\a-zA-Z]{2,6}"

	// boolean isValid = phoneString.matches(regexPattern);
	// private static Pattern VALID_PHONE_NUMBER =
	// Pattern.compile("^[0-9.()-]{10,25}$");
	//
	// public boolean isValidPhoneNumber(String s) {
	//
	// Matcher m = VALID_PHONE_NUMBER.matcher(s);
	//
	// return m.matches();

	public static boolean isValid(String email) {
		String regex = "^(.+)@(\\S+)$";
		Pattern pattern = Pattern.compile(regex);
		if (email == null)
			return false;
		return pattern.matcher(email).matches();
	}

	public static void main(String[] args) {
		String email = "ra@gmail.com";
		boolean result = isValid(email);
		if (result == true) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}

}
//		public  boolean validate(email) {
//			Matcher matcher = EMAIL_FORMAT.matcher(email);
//			return Pattern().matcher(email).matches();
//			}
//	
//	
//	validate("uiieyiw@gmail.com");
//
//
//}
